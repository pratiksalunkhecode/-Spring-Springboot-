package com.gfg65.Student_CRUD_api.StudentController;

import com.gfg65.Student_CRUD_api.Model.StudentRequestModel;
import com.gfg65.Student_CRUD_api.Model.StudentResponseModel;
import com.gfg65.Student_CRUD_api.Service.StudentService;
import com.gfg65.Student_CRUD_api.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("test")
    public String test(){
        return "My api start";
    }

    @PostMapping("/create")
    public StudentResponseModel create(@RequestBody StudentRequestModel studentRequestModel){
          return studentService.create(studentRequestModel);
    }

    @PutMapping("/update/{id}")
    public StudentResponseModel update(@PathVariable int id ,@RequestBody StudentResponseModel request) {
        return studentService.update(id,request);
    }

    @GetMapping("/get/{id}")
    public Student getstu(@PathVariable int id){
       return studentService.getStudent(id);
    }

   @GetMapping("/getall")
   public ArrayList<Student> getAll(){
        return studentService.getAll();
   }

}

/*
 * Add the following functionalities:
 * 1. Get All Employees
 * 2. Delete an Employee on the basis of ID
 * 3. Update an Employee on the basis of ID
 * 4. Get Employee on the basis of Name
 */