package com.spring.orm.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.dao.ProductDao;
import com.spring.orm.entities.Product;

public class ProductDaoImpl implements ProductDao{

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Integer add(Product product) {
		// insert
		
		return (Integer) this.hibernateTemplate.save(product);
	}

	@Transactional
	public void update(Product product) {
		// update
		this.hibernateTemplate.update(product);
	}

	@Transactional
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		Product product = this.hibernateTemplate.get(Product.class, productId);
		this.hibernateTemplate.delete(product);
	}

	public Product getProductById(Integer productId) {
		// Get single product by id
		return this.hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAllProducts() {
		// Get all products
		return this.hibernateTemplate.loadAll(Product.class);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
