package com.ly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.dao.UserMapper;
import com.ly.domain.User;
import com.ly.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserMapper userMapper;
	
	public void addUser(User user) {
		userMapper.insert(user);
	}

	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

}
