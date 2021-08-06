package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		
		Student student = (Student) context.getBean("student");
		
		Student student2 = (Student) context.getBean("student");
		
		System.out.println(student.hashCode());
		
		System.out.println(student2.hashCode());
		
		
		
		
	}

}
