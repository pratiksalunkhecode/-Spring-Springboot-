package com.pdm.Redis_SB_Mysql.Repository;

import com.pdm.Redis_SB_Mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
