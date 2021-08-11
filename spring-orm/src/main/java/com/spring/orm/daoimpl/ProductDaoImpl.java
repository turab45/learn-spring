package com.spring.orm.daoimpl;

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

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
