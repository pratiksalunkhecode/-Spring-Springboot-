package com.gfg_JBDL65.Microservicess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicessApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicessApplication.class, args);
	}

}
