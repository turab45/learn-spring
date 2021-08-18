package com.crudapp.dao;

import java.util.List;

import com.crudapp.entities.Product;

public interface ProductDao {
	public Integer add(Product product);
	public void update(Product product);
	public void delete(Integer productId);
	public Product getProductById(Integer productId);
	public List<Product> getAllProducts();
}
