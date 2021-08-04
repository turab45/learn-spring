package com.springcore.constructorinjection;

public class Ambiguity {
	private int a;
	private int b;
	
public Ambiguity(Double a, Double b) {
		
		this.a = a.intValue();
		this.b = b.intValue();
		
		System.out.println("Constructor: double, double");
	}

	public Ambiguity(Integer a, Integer b) {
		this.a = a;
		this.b = b;
		
		System.out.println("Constructor: int, int");
	}
	
	public Ambiguity(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		
		System.out.println("Constructor: String, String");
	}
	
	
	
	public void sum() {
		System.out.println("Sum = "+(this.a + this.b));
	}

	@Override
	public String toString() {
		return "Ambiguity [a=" + a + ", b=" + b + "]";
	}
	
	
	
	
	

}
