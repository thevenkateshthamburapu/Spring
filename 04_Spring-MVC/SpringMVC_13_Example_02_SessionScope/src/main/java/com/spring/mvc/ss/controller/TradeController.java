package com.spring.mvc.ss.controller;

import javax.inject.Provider;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.ss.model.Visitor;

@Controller
@RequestMapping("/trades")
public class TradeController {

	@Autowired
	private Provider<Visitor> visitorProvider;

	@RequestMapping("/**")
	public String handleRequestById(Model model, HttpServletRequest request) {
		model.addAttribute("msg", "trades request, serving page " + request.getRequestURI());
		visitorProvider.get().addPageVisited(request.getRequestURI());
		return "traders-page";
	}
}