package com.spring.mvc.bnuhm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav=new ModelAndView();
		// Set the view name
		mav.setViewName("welcome");
		// Set the data to model
		mav.addObject("welcomeMsg","Welcome to MVC.!");
		return mav;
	}
	

}

//url
//http://localhost:8632/SpringMVC_01_BeanNameUrlHandlerMapper_Example_02/welcome
