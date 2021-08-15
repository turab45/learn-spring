package com.springmvc.dao;

import org.springframework.stereotype.Service;

import com.springmvc.modal.User;
@Service
public interface UserDao {
	public Integer add(User user);
}
