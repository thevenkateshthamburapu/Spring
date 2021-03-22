package com.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome(){
		return "Welcome To Spring Boot Web";
	}
	
	
	
	@RequestMapping("/hi")
	public String welcomes(){
		return "Say To hi";
	}


	@RequestMapping("/hello")
	public String welcomees(){
		return "Say To hello";
	}
	
}
