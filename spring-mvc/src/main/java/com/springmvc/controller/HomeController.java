package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HomeController {
	
	@RequestMapping(path="/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "Turab");
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String start() {
		System.out.println("Starting page...");
		return "start";
	}
	
	@RequestMapping(path="/about")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Turab Bajeer");
		modelAndView.setViewName("about");
		return modelAndView;
	}
	
}

