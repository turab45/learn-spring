package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private Address address;

	/*To use the constructor injection simply put @AutoWired annotation on the constructor.*/
	public Employee(Address address) {
		super();
		this.address = address;
	}
	
	

	public Employee() {
		
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
