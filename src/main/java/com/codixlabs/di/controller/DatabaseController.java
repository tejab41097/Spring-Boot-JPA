package com.codixlabs.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codixlabs.di.model.User;
import com.codixlabs.di.service.DatabaseService;

@RestController
@RequestMapping(path ="/auth")
public class DatabaseController {

	@Autowired
	DatabaseService databaseService;
	
	@PostMapping
	void register(@RequestBody User user) {
		databaseService.register(user);
	}
	
}
