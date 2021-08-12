package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HomeController {
	
	@RequestMapping(path="/home", method = RequestMethod.GET)
	public String home() {
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String start() {
		System.out.println("Starting page...");
		return "start";
	}
}

