package com.codixlabs.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codixlabs.di.dao.UserDao;
import com.codixlabs.di.model.User;

@Service
public class DatabaseService implements IDatabaseService {

	@Autowired
	UserDao userDao;

	@Override
	public String register(User user) {
		try {
			User savedUser = userDao.save(user);
			if (savedUser != null)
				return user.getFullName() + " is Registered Successfully";
			else
				return "User Not Registered. Please, send Email, Phone Number & Full Name!";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "User Not Registered. Please, send Email, Phone Number & Full Name!";
		}
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public String updateUserPhoneNumber(User user) {
		try {
			int isUpdated = userDao.updatePhoneNumber(user.getEmail(), user.getPhoneNumber());
			if (isUpdated == 0) // nothing is updated
				return "User Not Found";
			else // if isUpdated = 1 some updation has happened
				return user.getEmail() + " phone number is updated to:" + user.getPhoneNumber();
		} catch (Exception e) {
			e.printStackTrace();
			return "Please Send Phone Number & Email";
		}
	}

	@Override
	public String deleteByEmail(String email) {
		try {
			int isDeleted = userDao.deleteByEmail(email);
			if (isDeleted == 0) // nothing is Deleted
				return "User Not Found";
			else // user is deleted by email
				return email + " Deleted";
		} catch (Exception e) {
			e.printStackTrace();
			return "Please Send Email";
		}
	}

}
