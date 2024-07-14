package com.gfg_JBDL65.userservice.Repo;

import com.gfg_JBDL65.userservice.Model.User;
import com.gfg_JBDL65.userservice.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class userCache {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    public void save(User user){
        this.redisTemplate.opsForValue().set(, user, Constant.USER_REDIS_KEY_EXPIRE, TimeUnit.SECONDS);//cache for onne day
    }


}
