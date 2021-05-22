package com.codixlabs.di.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codixlabs.di.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

//	@Query(name = "INSERT INTO USER(full_name,email,phone_number) VALUES( user.full_name, user.email, user.phone_number)", nativeQuery = true)
//	void registerUser(User user);
}
