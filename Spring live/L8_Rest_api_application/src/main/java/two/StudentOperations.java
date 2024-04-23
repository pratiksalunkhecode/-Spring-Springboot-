package two;

import com.gfg_L8.L8_Rest_api_application.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentOperations {

    private Student2 student2;

    @GetMapping("/test/{name}")
    public String hello(@PathVariable String name){
        return "hello test "+name;
    }

    @GetMapping("/test/t/{MobileName}/{model}")
    public String pathVar(@PathVariable String MobileName, @PathVariable String model){
              return "My new mobile name is "+MobileName+" and the mobile model is "+model;
    }

    @GetMapping("/test/{Nameofbook}/{id}")
    public String bookdetails(@PathVariable String Nameofbook, @PathVariable String id){
        return "My book name is "+Nameofbook+" and the id is "+id;
    }

    @GetMapping("/book/{id}")
    public String bookdetails(@PathVariable int id){

        if(id < 10){
            throw new NullPointerException("book is not present please chek only > 10");
         //   System.out.println("book is not present");
        }
        return "related "+id+" book is present rack number two ";
    }

    @GetMapping("/products")
    public String restParam(@RequestParam String category, @RequestParam String price_range){
        return "The "+category+" and the "+price_range+" is not available now";
    }

    @PostMapping("/post")
    public String poststudent(@RequestBody Student student){
        System.out.println(student);
        return student.toString();
    }

//    @GetMapping("/getStudent")
//    public List<Student2> getStudent(){
//        List<Student2> students = new ArrayList<>();
//        boolean add = students.add(new Student2(1, "pratik", "mumbai"));
//
//
//    }

    @GetMapping("/test/{name}/{id}/{std}")
    public String bookLibrari(@PathVariable String name, @PathVariable String id,
                                    @PathVariable String std,@RequestParam (required = false) String name1, @RequestParam (required = false) String address){


        String str = "hello";
        str +=name+" ";
        str +=id+" ";
        str +=address+" ";
        return str;

    }

    @GetMapping("/student")
    public Student2 getStudent() {
        Student2 s = new Student2(1,"pratik","mumbai",23);
        s.setAdd(new address());
        return s;
    }

    @PostMapping("/posts")
    public String posts(@RequestBody Student2 student2){
        System.out.println(student2);
      //  student2.setAdd(new address());
        return student2.toString();
    }
}
