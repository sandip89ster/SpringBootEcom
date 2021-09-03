package com.buy.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buy.ecom.exception.UserNotFoundException;
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

	@Override
	public User getUserById(int id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if(!optionalUser.isPresent()) {
			throw new UserNotFoundException("User not found");
		}
		return optionalUser.get();
	}

}
