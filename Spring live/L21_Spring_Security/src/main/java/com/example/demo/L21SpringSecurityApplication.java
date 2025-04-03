package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L21SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(L21SpringSecurityApplication.class, args);
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test API works";
	}

}

/*
 * 
 * 
 * 
@Bean
@Order(SecurityProperties.BASIC_AUTH_ORDER) //very low priority
SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws
Exception {
  http.authorizeRequests().anyRequest().authenticated();
  http.formLogin();
  http.httpBasic();
  return http.build();
}

 */
