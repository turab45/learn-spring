package com.search.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public RedirectView search(@RequestParam("query") String query) {
		String url = "https://www.google.com/search?q="+query;
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
	}
}
