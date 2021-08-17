package com.springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler() {
		return "exception";
	}
}
