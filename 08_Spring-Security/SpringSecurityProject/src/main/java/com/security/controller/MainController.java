package com.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	private static Logger log=LoggerFactory.getLogger(MainController.class);

	@GetMapping("/login")
	public String login() {
		log.info("======Login Method Invoked=======");
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		log.info("======Home Method Invoked=======");
		return "index";
	}
	
}
