package com.codixlabs.di.service;

import java.util.List;

import com.codixlabs.di.model.User;

public interface IDatabaseService {

	String register(User user);
	
	List<User> getAllUsers();
	
	String updateUserPhoneNumber(User user);
	
	String deleteByEmail(String email);
}
