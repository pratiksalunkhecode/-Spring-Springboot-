package com.Redis1.SpringBootWithRedis;

import com.Redis1.SpringBootWithRedis.enitity.Product;
import com.Redis1.SpringBootWithRedis.enitity.ProductDAO.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootWithRedisApplication {

	@Autowired
	ProductDAO productDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRedisApplication.class, args);
	}

	@GetMapping("/test")
	public String test() {
		return "Test API works";
	}
	@PostMapping("/create")
	public Product save(@RequestBody Product product ) {
		return productDAO.save(product);
	}
	@GetMapping("/all")
	public List<Object> getAll() {
		return productDAO.getAll();
	}



}
