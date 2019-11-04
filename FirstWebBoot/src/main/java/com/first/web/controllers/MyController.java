package com.first.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.first.boot.Alien;

@Controller
public class MyController {
	
	@RequestMapping("home")
	public ModelAndView processHome(Alien alien) {
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("feedback")
	public ModelAndView processFeedback() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Feedback");
		return mv;
	}

}
