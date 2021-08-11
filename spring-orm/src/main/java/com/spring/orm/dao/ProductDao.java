package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Product;

public interface ProductDao {
	public Integer add(Product product);
	public void update(Product product);
	public void delete(Integer productId);
	public Product getProductById(Integer productId);
	public List<Product> getAllProducts();
	
}
