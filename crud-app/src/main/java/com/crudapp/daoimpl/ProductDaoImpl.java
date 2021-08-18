package com.crudapp.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.crudapp.dao.ProductDao;
import com.crudapp.entities.Product;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class ProductDaoImpl implements ProductDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void add(Product product) {
		// create a new product
		this.hibernateTemplate.saveOrUpdate(product);
	}

	@Transactional
	public void update(Product product) {
		// update the product
		this.hibernateTemplate.update(product);;
	}

	@Transactional
	public void delete(Integer productId) {
		// delete the product
		Product product = this.hibernateTemplate.get(Product.class, productId);
		this.hibernateTemplate.delete(product);;
	}

	public Product getProductById(Integer productId) {
		// get single product
		return this.hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAllProducts() {
		// get all the products
		List<Product> all = this.hibernateTemplate.loadAll(Product.class);
		java.util.Collections.reverse(all);
		return all;
	}

	
	// getters and setters of hibernateTemplate
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
