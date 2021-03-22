package com.spring.mvc.bnuhm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class DateController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		Date date=new Date();
		String message="Hi, Today's date is : "+date.toString();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("displayDate");
		mav.addObject("dateMsg",message);
		return mav;
	}

}
//url
//http://localhost:8632/SpringMVC_01_BeanNameUrlHandlerMapper_Example_02/date
