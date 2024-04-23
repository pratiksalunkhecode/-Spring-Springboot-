package com.example.L8_Student_CRUD_operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class L8StudentCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(L8StudentCrudOperationApplication.class, args);
		System.out.println("start my application");
	}

}

/**
 * API Flow:
 * http://localhost:8080/student/test
 *
 * http://localhost:8080/student/create : {
 "name":"pratik",
 "email":"adit@aditya.com",
 "password":"password"
 }

 O/P:
 {
 "id": 9878,
 "name": "Aditya",
 "email": "aditya@aditya.com"
 }

 http://localhost:8080/student/get/9878
 {
 "id": 9878,
 "email": "aditya@aditya.com",
 "name": "Aditya",
 "password": "password"
 }
 */
