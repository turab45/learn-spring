package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11 + 11}")
	private Integer  x;
	@Value("#{ 10 + 10}")
	private Integer y;
	
	@Value("#{ T(java.lang.Math).sqrt(35)}") // Invoke the static method
	private double z;
	
	@Value("#{ T(java.lang.Math).E}") // Invoke the static variable
	private double e;
	
	@Value("#{ new java.lang.String('Turab Bajeer')}")
	private String name;
	
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
