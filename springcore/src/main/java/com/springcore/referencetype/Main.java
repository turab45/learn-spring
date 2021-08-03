package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referencetype/config.xml");
		
		Product product = (Product) context.getBean("product");
		
		System.out.println(product);

	}

}
