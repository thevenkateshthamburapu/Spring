package com.spring.boot.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DateController {
	@RequestMapping("/date")
	public String displayDate(Model model){
		model.addAttribute("msg", new Date());
		return "dateDisplay";
	}

}
