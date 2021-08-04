package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Course implements InitializingBean, DisposableBean{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init");
		
	}
	
	
}
