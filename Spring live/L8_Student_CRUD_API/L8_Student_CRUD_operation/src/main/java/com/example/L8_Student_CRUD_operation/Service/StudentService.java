package com.example.L8_Student_CRUD_operation.Service;

import com.example.L8_Student_CRUD_operation.Model.StudentRequestModel;
import com.example.L8_Student_CRUD_operation.Model.StudentResponceModel;
import com.example.L8_Student_CRUD_operation.StudentEntity.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    HashMap<Integer, Student> studentHashMap;

    public StudentResponceModel studentres(StudentRequestModel request){
        if(studentHashMap == null){
            studentHashMap  = new HashMap<Integer, Student>();
        }
        Student s = new Student(request.getName(),request.getAddress(),request.getRoll());

       s.setId(getRandomNumber());
       if (studentHashMap.containsKey(s.getId())){
           s.setId(getRandomNumber());

       }
       studentHashMap.put(s.getId(),s);
        StudentResponceModel responce = new StudentResponceModel(s.getId(),s.getName(),s.getAddress());
        return responce;

    }


    public Student getstudent(int id){
        Student s = null;
        if(studentHashMap == null){
            System.out.println("Still Hash Map not contain value");
        }
        if(studentHashMap.containsKey(id)){
          s = studentHashMap.get(id);
        }
     return s;
    }

    public ArrayList<Student> getall(){
       ArrayList<Student> list = new ArrayList<Student>();
        if(studentHashMap == null){
            System.out.println("Empty hash map");
        }
        for (Map.Entry<Integer, Student> entry : studentHashMap.entrySet()) {

            list.add(entry.getValue());
        }
        return list;
    }
//public List<Student> getall() {
//    return new ArrayList<>(studentHashMap.values());
//}

   public Student deleteStu(int id) {

       //Student s = studentHashMap.remove(id);
       if (studentHashMap == null) {
           System.out.println("hash map is null now");
       }
       Student s = null;
       if (studentHashMap.containsKey(id)) {
           s = studentHashMap.remove(id);
       }

       return s;
   }

//  public Student getName(String name) {
//      //Student s = studentHashMap.get(name);
//      if (studentHashMap == null) {
//          System.out.println("hash map is empty now");
//      }
//
//      Student s = null;
//      if (studentHashMap.containsValue(name)) {
//          s = studentHashMap.get(name);
//
//      }
//      return s;
//
//  }

    public List<Student> getStudentsByName(String name) {

        List<Student> studentsWithName = new ArrayList<>();
        // Iterate through all students in the studentHashMap
        for (Student student : studentHashMap.values()) {
            // Check if the name of the current student matches the provided name (ignoring case)
            if (student.getName().equalsIgnoreCase(name)) {
                // If the names match, add this student to the list of students with the specified name
                studentsWithName.add(student);
            }
        }
        // Return the list of students with the specified name
        return studentsWithName;
    }

    private int getRandomNumber() {
        int min =1, max = 10000;
        return (int) ((Math.random() * (max - min)) + min);
    }


}

