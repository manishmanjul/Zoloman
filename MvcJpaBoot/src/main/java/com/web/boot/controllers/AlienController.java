package com.web.boot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.boot.model.Alien;
import com.web.boot.persistence.IAlienRepo;

@Controller
public class AlienController {

	@Autowired
	IAlienRepo alienRepo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Test message......");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/addAlien")
	public ModelAndView addAlien(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		System.out.println(alien.toString());
		mv.setViewName("home");
		
		alienRepo.save(alien);
		return mv;
	}
	
	@RequestMapping("/findAlien")
	public ModelAndView findAlien(@RequestParam("aid") int aid) {
		
		ModelAndView mv = new ModelAndView("update");
		
		Alien alien = alienRepo.findById(aid).orElse(null);
		mv.addObject("aid",aid);
		mv.addObject("alien",alien);
		
		return mv;
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam("aid") int aid) {
		
		ModelAndView mv = new ModelAndView("AlienResult");
		
		Alien alien = alienRepo.findById(aid).orElse(null);
		mv.addObject("aid",aid);
		mv.addObject("alien",alien);
		
		return mv;
	}
	
	@RequestMapping("deleteAlien")
	public ModelAndView deleteAlien(@RequestParam("aid") int aid) {
		
		ModelAndView mv = new ModelAndView("home");
		if(alienRepo.existsById(aid)) {
			Optional<Alien> alien = alienRepo.findById(aid);
			alienRepo.deleteById(aid);
			
			mv.addObject("status","Alien : " + alien.get() + " sucessfully deleted.");
		}
		
		return mv;
	}
	
	@RequestMapping("updateAlien")
	public ModelAndView updateAlien(Alien alien) {
		
		ModelAndView mv = new ModelAndView("update");
		alienRepo.save(alien);
		mv.addObject("updateStatus","Alien Updated succefully");
		
		return mv;
	}
	
	@RequestMapping("back")
	public String goBack() {
		return "home";
	}
}
