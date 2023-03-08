package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.UserEntity;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder enc;

	@Override
	public UserEntity addUserDetails(UserEntity user) {
		//encrypt the pwd
		user.setPassword(enc.encode(user.getPassword()));
		return userRepo.save(user);
	}

}
