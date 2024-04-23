package com.gfg_l15.springdatajpa.Controller;

import com.gfg_l15.springdatajpa.entity.Student;
import com.gfg_l15.springdatajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/re")
public class REController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/test")
    public String test(){
        return "test api RE";
    }

    //ResponseEntity<?> is a Spring class representing an HTTP response,
    // with <?> indicating the response body can be of any type.
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){

        Map<String, Object> map = new LinkedHashMap<>(); //linkhashmap insertion order can be maintain
        if(id < 0){
            map.put("status", 0);
            map.put("Invalid is pass", "Id can not less then 0");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }else {
try{
            Student s = studentService.getById(id);

                map.put("status", 1);
                map.put("message", "success");
                return new ResponseEntity<>(map, HttpStatus.OK);
            }catch (Exception e){
                map.put("status", 0);
                map.put("message", "student does not exist for id: "+id);
                map.put("error", e);
                return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
            }

        }

    }

}
