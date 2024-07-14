package com.gfg_JBDL65.userservice.userController;

import com.gfg_JBDL65.userservice.Model.User;
import com.gfg_JBDL65.userservice.Service.UserService;
import com.gfg_JBDL65.userservice.dto.UserCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    UserService userService;
    @PostMapping("/create")
    public void userCreation(@RequestBody UserCreateRequest userCreateRequest){
                  userService.create(userCreateRequest);
    }

    @GetMapping("/details")
    public User getUserDetails(@PathVariable("userId") int userId){
       return userService.getUser(userId);
    }

    // Other Apps would get the user details on the basis of mobile
     @GetMapping("/mobile/{mobileId}")
    public User getUserDetailsByMobile(@PathVariable("mobileId") String mobile){
        return userService.loadUserByUsername(mobile);
    }



}
