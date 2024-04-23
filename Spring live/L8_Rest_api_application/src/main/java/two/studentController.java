package two;

import org.springframework.web.bind.annotation.*;
import two.entity.Student3;
import two.model.StudentPostRequestModel;
import two.model.StudentPostResponceModel;

@RestController
@RequestMapping("/new")
public class studentController {

    @GetMapping("/test")
    public String hello(){
        return "My API Works";
    }

//    @PostMapping("/create")
//    public StudentPostResponceModel postRequestModel(@RequestBody StudentPostRequestModel studentRequest){
//
//      //  Student3 s = new Student3(12, studentRequest.getName(), studentRequest.getAddress());
//        StudentPostResponceModel responce = new StudentPostResponceModel(s.getId(),s.getName(),s.getAddress());
//
//        return  responce;
//    }




//    @PostMapping("/create")
//    public StudentPostResponseModel createStudent(@RequestBody StudentPostRequestModel requestModel) {
//
//        Student s = new Student(101, requestModel.getName(), requestModel.getRoll());
//        StudentPostResponseModel response = new StudentPostResponseModel(s.getId(), s.getName(), s.getRoll());
//
//        return response;
//
//    }

    @PostMapping("create2")
    public StudentPostResponceModel resMethod(@RequestBody StudentPostRequestModel request){

        Student3 s3 = new Student3(12,request.getName(),request.getAddress(),request.getCity());

        StudentPostResponceModel s4 = new StudentPostResponceModel(s3.getId(),s3.getName(),s3.getAddress(),s3.getCity());

         return s4;
    }

}
