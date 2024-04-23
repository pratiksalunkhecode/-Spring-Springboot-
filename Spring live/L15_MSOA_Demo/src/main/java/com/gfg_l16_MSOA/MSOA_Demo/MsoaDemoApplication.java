package com.gfg_l16_MSOA.MSOA_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsoaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsoaDemoApplication.class, args);
		System.out.println("up now");
	}

}
