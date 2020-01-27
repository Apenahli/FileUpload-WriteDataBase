package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserServiceee {

	void save(User user);

	List<User> findAll();
	
	User findByUsername(String userName);

}
