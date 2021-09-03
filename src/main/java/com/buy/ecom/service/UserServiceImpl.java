package com.buy.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buy.ecom.model.User;
import com.buy.ecom.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public String addUser(User user) {
		userRepository.save(user);
		return "User Added";
	}

	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "User Deleted";
	}

}
