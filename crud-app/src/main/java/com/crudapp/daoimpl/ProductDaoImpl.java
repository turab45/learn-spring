package com.crudapp.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.crudapp.dao.ProductDao;
import com.crudapp.entities.Product;

public class ProductDaoImpl implements ProductDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public Integer add(Product product) {
		// create a new product
		return (Integer) this.hibernateTemplate.save(product);
	}

	@Transactional
	public void update(Product product) {
		// update the product
		this.hibernateTemplate.update(product);;
	}

	@Transactional
	public void delete(Integer productId) {
		// delete the product
		Product product = this.hibernateTemplate.load(Product.class, productId);
		this.hibernateTemplate.delete(product);;
	}

	public Product getProductById(Integer productId) {
		// get single product
		return this.hibernateTemplate.load(Product.class, productId);
	}

	public List<Product> getAllProducts() {
		// get all the products
		return this.hibernateTemplate.loadAll(Product.class);
	}
	
	
}
