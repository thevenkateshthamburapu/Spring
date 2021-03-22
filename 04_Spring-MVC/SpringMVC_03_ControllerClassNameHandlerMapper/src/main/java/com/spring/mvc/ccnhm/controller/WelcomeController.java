package com.spring.mvc.ccnhm.controller;

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
//http://localhost:8326/SpringMVC_02_ControllerClassNameHandlerMapper/welcome.htm
