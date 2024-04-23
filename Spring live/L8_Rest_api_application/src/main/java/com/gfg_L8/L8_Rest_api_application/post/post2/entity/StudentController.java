package com.gfg_L8.L8_Rest_api_application.post.post2.entity;

import com.gfg_L8.L8_Rest_api_application.post.post2.model.StudentPostRequestModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/test")
    public String Test(){
        return "Test api works";
    }

    @PostMapping("/create")
    public StudentPostRequestModel postmodel2(@RequestBody StudentPostRequestModel requestmodel){

        Student s = new Student(101, requestmodel.getName(), requestmodel.getRoll());
        StudentPostRequestModel responce = new StudentPostRequestModel(s.getId(), s.getName(), s.getRoll());
        return responce;
    }

}
