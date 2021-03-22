package com.spring.mvc.rmhm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public String wish(Model model) {
		String msg = "Welcome to Spring MVC...!!";
		model.addAttribute("welcomeMsg", msg);
		return "welcome";
	}

}
//url
//http://localhost:8767/SpringMVC_04_RequestMappingHandlerMapping/welcome