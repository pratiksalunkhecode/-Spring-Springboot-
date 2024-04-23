package Two.service;

import Two.Repo.StudentRepo;
import Two.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


         @Autowired
         private StudentRepo studentRepo;


         public Student createStudent(Student student){
             return studentRepo.save(student);
         }

         public Object getById(int id){
             return studentRepo.findById(id);
         }

         public long getALl(){
            return studentRepo.count();
         }

         public void deleteById(int id){
          studentRepo.deleteById(id);

         }

    public List<Student> findByName(String name){
        return studentRepo.findByName(name);
    }

}
