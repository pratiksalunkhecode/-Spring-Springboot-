package com.gfg_l15.springdatajpa.Controller;

import com.gfg_l15.springdatajpa.entity.Student;
import com.gfg_l15.springdatajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public String test(){
        return "Test my API";
    }

    @GetMapping("/count")
    public long count(){
       return studentService.count();
    }

    @GetMapping("/find/{id}")
    public Student getById( @PathVariable int id){
        return studentService.getById(id);
    }

    @GetMapping("/findByName/{name}")
    public List<Student> findByName(@PathVariable String name){
        return studentService.findByName(name);
    }

    @PostMapping("/create")
    public Student CreateStudent(@RequestBody Student student){  //@RequestBody simplifies the process of handling incoming data in your Spring Boot
        // application, making it easier to work with data sent from clients.
          studentService.CreateStudent(student);
         return student;
    }

}
