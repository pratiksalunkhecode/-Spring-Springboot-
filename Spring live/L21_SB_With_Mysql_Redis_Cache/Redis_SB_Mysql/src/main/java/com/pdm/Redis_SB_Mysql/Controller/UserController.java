package com.pdm.Redis_SB_Mysql.Controller;

import com.pdm.Redis_SB_Mysql.Repository.UserRepository;
import com.pdm.Redis_SB_Mysql.entity.User;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/load")
    public String load(){
        System.out.println("load users");

        User u = new User(1,"pratik","10000");
        userRepository.save(u);

        User u2 = new User(2,"devin","1000");
        userRepository.save(u2);

        User u3 = new User(3,"Crysten","100");
        userRepository.save(u3);

        return "success";
    }

    @GetMapping("/user/{userId}")
    @Cacheable(value = "jbdl65-users", key = "#userId")
    public User getUserById(@PathVariable int userId){
        return userRepository.findById(userId).get();
    }


   // @Cacheable: This annotation indicates that the method's return value will be cached.
    //value is one of the attributes of the @Cacheable annotation and specifies the name of the
    // cache in which the method's results will be stored.

    //key is another attribute of @Cacheable and specifies the key under which the method's result will be cached.

}
