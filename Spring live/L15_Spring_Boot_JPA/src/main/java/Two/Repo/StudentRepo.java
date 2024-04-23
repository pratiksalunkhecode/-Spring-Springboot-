package Two.Repo;

import Two.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    void deleteById(Long studentId);

    @Query(value = "select s from Student s where s.name = ?1")
    public List<Student> findByName(String name);


}
