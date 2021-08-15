package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping(path="/contact", method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(path = "/contact-us", method = RequestMethod.POST)
	public String handleForm(@RequestParam("userName") String userName,
								@RequestParam("email") String email,
								@RequestParam("password") String password, Model model) {
		
		System.out.println("User Name : "+userName);
		System.out.println("Email     : "+email);
		System.out.println("Password  : "+password);
		
		
		model.addAttribute("name", userName);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		
		return "success";
	}
}
