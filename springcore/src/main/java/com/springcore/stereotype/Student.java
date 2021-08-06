package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component("object") to change the name of reference variable. by default it is student same as class name
@Scope("prototype") // This scope means create the new object everytime. by default is singelton (Do not create the create the new object everytime)
public class Student {
	@Value("Turab")
	private String name;
	@Value("Islamkot")
	private String city;
	
	@Value("#{addresses}")
	private List<String> addresses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	
}
