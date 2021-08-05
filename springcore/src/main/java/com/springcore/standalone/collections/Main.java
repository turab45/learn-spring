package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
		
		Person person = (Person) context.getBean("person", Person.class);
		
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("___________________________________________");
		System.out.println(person.getPhones().getClass().getName());
		

	}

}
