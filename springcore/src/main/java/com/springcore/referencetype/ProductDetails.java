package com.springcore.referencetype;

public class ProductDetails {
	private Integer price;
	private String status;
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ProductDetails [price=" + price + ", status=" + status + "]";
	}
	
	
}
