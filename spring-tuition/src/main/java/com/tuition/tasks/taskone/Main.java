package com.tuition.tasks.taskone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tuition/tasks/taskone/Application-context.xml");
		
		Product product = context.getBean("product", Product.class);
		
		System.out.println(product);
	}

}
