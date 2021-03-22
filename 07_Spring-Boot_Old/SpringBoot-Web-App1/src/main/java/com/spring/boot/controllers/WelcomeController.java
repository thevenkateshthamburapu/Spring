package com.spring.boot.controllers;

import org.springframework.stereotype.Controller;
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
		return "Welcome To hi";
	}


	@RequestMapping("/hello")
	public String welcomees(){
		return "Welcome To hello";
	}

}
