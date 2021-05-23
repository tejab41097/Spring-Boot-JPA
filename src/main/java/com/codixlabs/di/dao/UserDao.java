package com.codixlabs.di.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codixlabs.di.model.User;

@Repository
@Transactional
public interface UserDao extends JpaRepository<User, Integer> {

	@Modifying
	@Query(value = "UPDATE USER SET phone_number =?2 WHERE email=?1", nativeQuery = true)
	int updatePhoneNumber(String email, String phoneNumber);

	@Modifying
	@Query(value = "DELETE FROM USER WHERE email = ?1", nativeQuery = true)
	int deleteByEmail(String email);
}
