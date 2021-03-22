package com.spring.mvc.rmhm.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("msg", "Welcome to Spring MVC.!");
		return "home";
	}
	
	@RequestMapping(value = "/getDailyQuote.htm", method = RequestMethod.GET)
	public String getDailyQuote(Model model) {

		model.addAttribute("quote", "Don't Drink and Drive");
		return "quoteDisplay";
	}

}
//urls
//http://localhost:8767/SpringMVC_04_RequestMappingHandlerMapping_Example_02/getDailyQuote.htm
//http://localhost:8767/SpringMVC_04_RequestMappingHandlerMapping_Example_02/home.htm
