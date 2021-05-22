package com.codixlabs.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codixlabs.di.dao.UserDao;
import com.codixlabs.di.model.User;

@Service
public class DatabaseService implements IDatabaseService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void register(User user) {
		userDao.save(user);
	}

}
