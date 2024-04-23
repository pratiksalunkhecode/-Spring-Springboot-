package Two.Controller;

import Two.entity.Student;
import Two.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/test")
    public String print(){
        return "My API works";
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return student;
    }

    @GetMapping("/getStudent/{id}")
    public Student getById(@PathVariable int id){
        return (Student) studentService.getById(id);
    }

    @GetMapping("/findByName/{name}")
    public List<Student> findByName(@PathVariable String name){
        return (List<Student>) studentService.findByName(name);
    }

    @GetMapping("/count")
    public long getALl(){
        return studentService.getALl();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteById(@PathVariable int id,@RequestBody Student student){
        studentService.deleteById(id);
      //  System.out.println("student delete success");
        return "student delete successfully and the deleted id is :"+id;
    }



}
