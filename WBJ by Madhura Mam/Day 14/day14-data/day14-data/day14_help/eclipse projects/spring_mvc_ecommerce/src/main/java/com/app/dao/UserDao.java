package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.User;

public interface UserDao extends JpaRepository<User,Long>{
//add a method for user validation
//	User validateUser(String email,String pass);
	Optional<User> findByEmailAndPassword(String em,String pass);
}
