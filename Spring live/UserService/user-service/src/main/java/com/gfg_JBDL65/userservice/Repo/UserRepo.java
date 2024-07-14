package com.gfg_JBDL65.userservice.Repo;

import com.gfg_JBDL65.userservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByMobile(String mobile); // user find using mobile number

}
