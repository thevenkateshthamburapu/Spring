package com.spring.mvc.suhm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("welcomeMsg", "Welcome To Spring MVC");
		return mav;
	}

}
//url
//http://localhost:8632/SpringMVC_02_SimpleUrlHandlerMapper_Example_02//welcome