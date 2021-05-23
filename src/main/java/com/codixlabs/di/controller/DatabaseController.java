package com.codixlabs.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codixlabs.di.model.User;
import com.codixlabs.di.service.IDatabaseService;

@RestController
@RequestMapping(path = "/auth")
public class DatabaseController {

	@Autowired
	IDatabaseService databaseService;

	@PostMapping
	String register(@RequestBody User user) {
		return databaseService.register(user);
	}
	
	@GetMapping
	List<User> getAllUsers(){
		return databaseService.getAllUsers();
	}

	@PatchMapping
	String updateUserPhoneNumber(@RequestBody User user) {
		return databaseService.updateUserPhoneNumber(user);
	}
	
	@DeleteMapping
	String deleteUserEmail(@RequestParam(name = "email") String email) {
		return databaseService.deleteByEmail(email);
	}
}
