package com.gfg_l15.springdatajpa.service;

import com.gfg_l15.springdatajpa.Repo.StudentRepo;
import com.gfg_l15.springdatajpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service //@component yes
public class StudentService {

   @Autowired
   private StudentRepo studentRepo;


    public long count(){
       return studentRepo.count();
    }

   public Student getById(int id){
       return studentRepo.findById(id).get();
   }

   public List<Student> findByName(String name){
        return studentRepo.findByName(name);
   }

    public Student CreateStudent(Student student){
            return studentRepo.save(student);
    }

}
