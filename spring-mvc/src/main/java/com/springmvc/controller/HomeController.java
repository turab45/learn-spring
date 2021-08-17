package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path = "/user/{userId}", method = RequestMethod.GET)
	public String getUserById(@PathVariable("userId") Integer id) {
		System.out.println(id);
		return "";
	}
	
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

