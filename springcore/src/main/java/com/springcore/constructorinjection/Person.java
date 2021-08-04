package com.springcore.constructorinjection;



public class Person {
	private Integer id;
	private String name;
	private Certi certi;
	
	public Person(Integer id, String name, Certi certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", "+certi+"]";
	}
	
	
	
}
