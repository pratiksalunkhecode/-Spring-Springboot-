package com.gfg65.Student_CRUD_api.Service;

import com.gfg65.Student_CRUD_api.Model.StudentRequestModel;
import com.gfg65.Student_CRUD_api.Model.StudentResponseModel;
import com.gfg65.Student_CRUD_api.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    HashMap<Integer, Student> studentHashMap;

    public StudentResponseModel create(StudentRequestModel studentRequestModel){

        if (studentHashMap == null){
            studentHashMap = new HashMap<Integer, Student>();
        }

        Student s = new Student(studentRequestModel.getName(), studentRequestModel.getEmail(), studentRequestModel.getPassword());
        s.setId(getRandomnumber());
        if (studentHashMap.containsKey(s.getId()))
        {
            s.setId(getRandomnumber());
        }
        studentHashMap.put(s.getId(), s);

        StudentResponseModel responce = new StudentResponseModel(s.getId(), s.getName(), s.getEmail());
        return responce;
    }


    public StudentResponseModel update(int id, StudentResponseModel request) {
        if(studentHashMap == null) {
            studentHashMap = new HashMap<Integer, Student>();
        }


        Student s = new Student(request.getEmail(), request.getName(), request.getPassword());

        studentHashMap.put(id, s);

        StudentResponseModel response = new StudentResponseModel(s.getId(), s.getName(), s.getEmail());

        return response;

    }


    @GetMapping("/")
    public Student getStudent(int id){
      Student s = null;
        if (studentHashMap == null){
            System.out.println("Hashmap not created yet.");
        }
        if(studentHashMap.containsKey(id)){
           s = studentHashMap.get(id);
        }
        return s;
    }


    public ArrayList<Student> getAll(){

        ArrayList<Student> list = new ArrayList<Student>();
        if (studentHashMap == null){
            System.out.println("Hashmap not created yet.");
        }
        for(Map.Entry<Integer, Student> entry : studentHashMap.entrySet()){
            list.add(entry.getValue());
        }
        return list;

    }


    private int getRandomnumber(){
        int min = 1, max = 1000;
        return (int) ((Math.random() * max - min) + min);
    }


}
