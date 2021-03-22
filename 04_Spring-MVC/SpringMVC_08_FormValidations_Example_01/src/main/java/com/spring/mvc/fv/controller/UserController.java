package com.spring.mvc.fv.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.fv.model.User;
import com.spring.mvc.fv.validator.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserValidator userValidator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.addValidators(userValidator);
	}
	
	@GetMapping("/")
	public String userForm(Model model,Locale locale){
		model.addAttribute("user",new User());
		return "userForm";
	}
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user")@Validated User user,BindingResult result,Model model){
		if(result.hasErrors()){
			return "userForm";
		}
		return "success";
	}

}
//url
//http://localhost:8767/SpringMVC_08_FormValidations_Example_01/
