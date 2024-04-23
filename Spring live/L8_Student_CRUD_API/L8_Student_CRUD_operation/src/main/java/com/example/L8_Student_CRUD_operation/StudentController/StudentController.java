package com.example.L8_Student_CRUD_operation.StudentController;

import com.example.L8_Student_CRUD_operation.Model.StudentRequestModel;
import com.example.L8_Student_CRUD_operation.Model.StudentResponceModel;
import com.example.L8_Student_CRUD_operation.Service.StudentService;
import com.example.L8_Student_CRUD_operation.StudentEntity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/test")
    public String test(){
        return "My API workss";
    }


    @PostMapping("/create")
    public StudentResponceModel studentres(@RequestBody StudentRequestModel request){
        return studentService.studentres(request);

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudent(@PathVariable int id){

        Student student = studentService.getstudent(id);

        if(student != null){
            return ResponseEntity.ok(student);
        }else{
            System.out.println("not found");
            return ResponseEntity.notFound().build();

        }

    }

    @GetMapping("/get/all")
    public ArrayList<Student> getStudent(){

        return studentService.getall();

//        if(student != null){
//            return ResponseEntity.ok(student);
//        }else{
//            return ResponseEntity.notFound().build();
//        }
    }

    @DeleteMapping("/deleteStu/{id}")
    public Student deleteStu(@PathVariable int id){
        return studentService.deleteStu(id);
    }

   @GetMapping("/getName/{name}")
   public List<Student> getName(@PathVariable String name){

// List<Student> students = studentService.getStudentsByName(name);
//
//        if(studentService != null){
//            return ResponseEntity.ok(student);
//        }else {
//            return ResponseEntity.notFound().build();
//        }

       return studentService.getStudentsByName(name);

   }

}


/*
 * Add the following functionalities:
 * 1. Get All Employees
 * 2. Delete an Employee on the basis of ID
 * 3. Update an Employee on the basis of ID
 * 4. Get Employee on the basis of Name
 */