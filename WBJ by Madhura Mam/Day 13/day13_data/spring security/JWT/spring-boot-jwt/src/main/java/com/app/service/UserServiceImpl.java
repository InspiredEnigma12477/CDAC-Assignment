package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
import com.app.dto.UserRegResponse;
import com.app.entities.UserEntity;
import com.app.repository.RoleRepository;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	// dep : user repo n role repo
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RoleRepository roleRepo;

	// mapper
	@Autowired
	private ModelMapper mapper;
	// password enc
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public UserRegResponse registerUser(UserDTO user) {
		// Objective : 1 rec inserted in users table n insert n recs in link table
		// user_roles
		// 1. Map dto --> entity
		UserEntity userEntity = mapper.map(user, UserEntity.class);
		// 2. Map Set<UserRole : enum> ---> Set<Role :entity> n assign it to the
		// transient user entity
		userEntity.setUserRoles(roleRepo.findByRoleNameIn(user.getRoles()));
		// 3. encode pwd
		userEntity.setPassword(encoder.encode(user.getPassword()));
		// 4 : Save user details
		UserEntity persistentUser = userRepo.save(userEntity);
		return new UserRegResponse("User registered successfully with ID " + persistentUser.getId());
	}

}
