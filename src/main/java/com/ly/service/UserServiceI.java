package com.ly.service;

import java.util.List;

import com.ly.domain.User;

public interface UserServiceI {

	void addUser(User user);
	
	User getUserById(String id);
	
	List<User> getAllUser();
}
