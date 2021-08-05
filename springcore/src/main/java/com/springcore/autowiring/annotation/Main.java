package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/config.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee);
		
		
	}

}
