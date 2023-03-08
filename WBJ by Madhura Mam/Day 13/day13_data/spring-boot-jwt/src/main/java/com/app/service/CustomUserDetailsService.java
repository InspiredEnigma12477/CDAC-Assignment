package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.entities.UserEntity;
import com.app.repository.UserRepository;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity user = userRepo.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("Invalid Email ID"));
		//use email valid
		return new CustomUserDetails(user);
	}

}
