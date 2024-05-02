package com.gfg.EmbededServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmbededServerApplication {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger("check");
		logger.info("this is my log");
		logger.warn("this is warn");
		logger.debug("this is my debug");
		logger.trace("this is trace");
		SpringApplication.run(EmbededServerApplication.class, args);
	}

	@GetMapping("/test")
	public String test(){
		return "Running on jetty server";
	}

}
