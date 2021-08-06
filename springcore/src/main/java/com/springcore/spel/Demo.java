package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11 + 11}")
	private Integer  x;
	@Value("#{ 10 + 10}")
	private Integer y;
	
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
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
