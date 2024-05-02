package com.pdm.Redis_SB_Mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableCaching
public class RedisSbMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSbMysqlApplication.class, args);
		System.out.println("running");
	}

}
