package com.first.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("home")
	public String processHome() {
	
		return "home.jsp";
	}
	
	@RequestMapping("feedback")
	public String processFeedback() {
		
		return "Feedback.jsp";
	}

}
