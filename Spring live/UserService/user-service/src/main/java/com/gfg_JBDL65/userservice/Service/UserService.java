package com.gfg_JBDL65.userservice.Service;

import com.gfg_JBDL65.userservice.Model.User;
import com.gfg_JBDL65.userservice.Repo.UserRepo;
import com.gfg_JBDL65.userservice.dto.UserCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public void create(UserCreateRequest createRequest){
               User user = createRequest.to();
               userRepo.save(user);


               // now we have 2 microservicess eg: User and Wallet
               // User calls the API user creation ..... should this create automatically create wallet
               // it should automatically create wallet
                // Wallet creation take 2 - 3 sec.
               // Thia ia kafka use case because we dont want user to wait 2-3 sec for wallet.
               // Kafka Producer
    }

    public User getUser(int userId){
        User user = userRepo.findById(userId).get();
        return user;
    }

    public User loadUserByUsername(String userName){
       return userRepo.findByMobile(userName);
    }

}
