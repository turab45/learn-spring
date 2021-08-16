package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.modal.Student;

@Controller
public class ComplexFormController {
	@RequestMapping(path = "/complex", method = RequestMethod.GET)
	public String form() {
		return "complex_form";
	}
	
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "success";
	}
}
