package com.springmvc.daoimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.UserDao;
import com.springmvc.modal.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Integer add(User user) {
		// save user
		return (Integer) this.hibernateTemplate.save(user);
	}

}
