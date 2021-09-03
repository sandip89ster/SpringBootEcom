package com.buy.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buy.ecom.model.User;
import com.buy.ecom.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
