package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWelcomeExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWelcomeExampleApplication.class, args);
		System.out.println("*******Welcome to Spring Boot..!!******");
	}

}
