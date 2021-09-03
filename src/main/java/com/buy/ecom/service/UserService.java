package com.buy.ecom.service;

import java.util.List;

import com.buy.ecom.model.User;

public interface UserService{
	List<User> getAllUsers();
	String addUser(User user);
	String deleteUser(int id);
}
