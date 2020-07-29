package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserRepository;
import com.model.User;


// @restController is for --
// @CrossOrigin is used to specify the calls that made this controller to different like deiff domains.
// @RequestMapping is map or get request to return the list of users.

//annotations
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path="users")


public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<User> getUsers(){
		System.out.println("My List" +userRepository.findAll());
		return userRepository.findAll();
		
	}
	
	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
}
