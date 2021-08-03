package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee);
		System.out.println(employee.getPhones());
		System.out.println(employee.getCourses());
		System.out.println(employee.getAddresses());
	}

}
