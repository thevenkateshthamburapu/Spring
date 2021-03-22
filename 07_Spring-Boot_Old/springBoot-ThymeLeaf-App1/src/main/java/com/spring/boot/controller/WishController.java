package com.spring.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

public class WishController {
	@Value("${welcome.message:test}")
	 private String welcome="hello nagaraju";
		//@Value("${welcome.message:test}")
		//private String message = "Hello World";

		@RequestMapping("/")
		public String welcome(Map<String, Object> model) {
			model.put("message", this.welcome);
			return "welcome";
		}
	

}
