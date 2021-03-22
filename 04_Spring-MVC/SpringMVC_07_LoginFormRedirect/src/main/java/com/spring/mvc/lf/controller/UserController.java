package com.spring.mvc.lf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.lf.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String displayLoginForm(Model model) {
		model.addAttribute("user", new User());
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, @ModelAttribute("user") User u) {
		if (u.getUname().equals("admin") && u.getPwd().equals("admin123")) {
			//login successful
			return "redirect:/buidDashboard";
		} else {
			//login failure
			model.addAttribute("user",new User());
			model.addAttribute("errorMsg","Invalid Credentials");
			return "loginForm";
		}
	}
	
	@RequestMapping("/buidDashboard")
	public String dashboard(Model model){
		model.addAttribute("msg","Reports generating.....");
		return "dashboard";
	}

}
//urls
//http://localhost:8767/SpringMVC_07_LoginForm/loginForm
//user name =admin
//password =admin123