package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.modal.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	// This method contains the comman data which is being used on multiple pages
	@ModelAttribute
	public void commanDataForPages(Model model) {
		model.addAttribute("title", "User Registration From");
		model.addAttribute("desc", "Provide all the required data to get started!");
	}
	
	
	@RequestMapping(path="/contact", method = RequestMethod.GET)
	public String contact() {
		
		int a = 12/0;
		
		return "contact";
	}
	
	// This method will bind all the values to the object and it will this object to Modal to. So, we can access it anywhere.
	@RequestMapping(path = "/contact-us", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user) {
		this.userService.createUser(user);
		return "success";
	}
	
	
	// This was not a good method since we have to write a lot of code,So use ModalAttribute method
//	@RequestMapping(path = "/contact-us", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("userName") String userName,
//								@RequestParam("email") String email,
//								@RequestParam("password") String password, Model model) {
//		
//		System.out.println("User Name : "+userName);
//		System.out.println("Email     : "+email);
//		System.out.println("Password  : "+password);
//		
//		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
//		
//		return "success";
//	}
}
