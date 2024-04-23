package com.gfg_l15.springdatajpa.Repo;

import com.gfg_l15.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

  @Query(value = "select s from Student s where s.name = ?1")
  public List<Student> findByName(String name);

  @Query(value = "select s from Student s where s.name =?1 and s.id=?2")
  public List<Student> findByName(String name,int id);




}
