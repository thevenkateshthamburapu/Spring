package com.spring.mvc.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String greet(Model model){
		model.addAttribute("msg", "Welcome to Spring MVC..!!");
		return "welcome";
	}

}
//create web.xml file WEB-INF folder (without any errors)

//url
//http://localhost:8767/SpringMVC_06_ZeroXMLApp/welcome
