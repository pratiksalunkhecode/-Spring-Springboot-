package com.gfg_l16_MSOA.MSOA_Iteam_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsoaIteamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsoaIteamServiceApplication.class, args);
	}

}
