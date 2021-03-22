package com.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.dto.UserRegistrationDto;
import com.security.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	private static Logger log=LoggerFactory.getLogger(UserRegistrationController.class);

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
		log.info("======UserRegistrationDto Method Invoked=======");
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		log.info("======showRegistrationForm Method Invoked=======");
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		log.info("======registerUserAccount Method Invoked=======");
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
}
