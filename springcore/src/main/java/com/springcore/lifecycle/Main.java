package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// This method is called to register the shutdown hook. To call the destroy method
			context.registerShutdownHook();
				
		Student student = (Student) context.getBean("student");
		
		Course course = (Course) context.getBean("course");
		
		System.out.println(course);
		
		
		
	}

}
