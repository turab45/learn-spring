package com.springcore.referencetype;

public class Product {
	private Integer id;
	private String title;
	private ProductDetails productDetailsObj;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public ProductDetails getProductDetailsObj() {
		return productDetailsObj;
	}
	public void setProductDetailsObj(ProductDetails productDetailsObj) {
		this.productDetailsObj = productDetailsObj;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", productDetails=" + productDetailsObj + "]";
	}
	
	
	
}
