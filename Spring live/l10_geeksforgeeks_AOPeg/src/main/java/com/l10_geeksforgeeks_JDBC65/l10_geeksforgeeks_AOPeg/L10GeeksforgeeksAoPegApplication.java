package com.l10_geeksforgeeks_JDBC65.l10_geeksforgeeks_AOPeg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class L10GeeksforgeeksAoPegApplication {

	public static void main(String[] args) {

		//SpringApplication.run(L10GeeksforgeeksAoPegApplication.class, args);

//		ApplicationContext context = new
//				ClassPathXmlApplicationContext("spring-config.xml");
//
//		Student s= (Student) context.getBean("student");
//		s.getName();
//		s.getAge();
//		s.throwEx();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		 Student s = (Student) context.getBean("student");

		 s.getAge();
		 s.getName();
		// s.Exception();



	}

}
