package com.spring.mvc.lf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.lf.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "/displayForm.htm", method = RequestMethod.GET)
	public String displayForm(Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}

	@RequestMapping(value = "/regUser.htm", method = RequestMethod.POST)
	public String regUser(Model model, @ModelAttribute("user") User u) {
		System.out.println(u);
		model.addAttribute("user", u);
		return "display";
	}

}
// urls
//http://localhost:8767/SpringMVC_07_LoginForm/displayForm.htm