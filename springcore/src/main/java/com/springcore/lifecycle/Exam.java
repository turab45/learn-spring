package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exam {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Exam [title=" + title + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside exam init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside exam destroy");
	}
}
