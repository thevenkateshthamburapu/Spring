package com.spring.mvc.rmhm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello")
	public String sayHi(Model model){
		
		String message ="Hi, How are you..!";
		model.addAttribute("helloMsg",message);
		return "hello";
	}
	
}
//url
//http://localhost:8767/SpringMVC_04_RequestMappingHandlerMapping/hello
