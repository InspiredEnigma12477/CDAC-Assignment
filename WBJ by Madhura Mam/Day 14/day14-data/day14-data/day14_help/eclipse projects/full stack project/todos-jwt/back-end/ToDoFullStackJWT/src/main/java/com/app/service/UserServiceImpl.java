package com.app.service;

import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dao.RoleRepository;
import com.app.dao.UserRepository;
import com.app.dto.SignUpRequest;
import com.app.dto.UserResponseDTO;
import com.app.pojos.Role;
import com.app.pojos.User;
import com.app.pojos.UserRoles;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public UserResponseDTO registerUser(SignUpRequest request) {
		// create User from request payload
		/*
		 * { "userName": "Rama", "email": "rama@gmail.com", "password": "ram#12345",
		 * "roles": [ "ROLE_ADMIN" ] }
		 */
		User user = new User();
		user.setUserName(request.getUserName());
		user.setEmail(request.getEmail());
		user.setPassword(encoder.encode(request.getPassword()));//set encoded pwd
		
		Set<Role> roles = request.getRoles().stream()//convert Set<String> : role names ---> Stream<String>
		//mapping roleName --> Role (using RoleRepo) 		
				.map(roleName -> roleRepo.findByUserRole(UserRoles.valueOf(roleName)).get())
				//collect in a Set<Role>
				.collect(Collectors.toSet());
		user.setRoles(roles);
		user.setActive(true);
		User persistentUser = userRepo.save(user);//persisted user details in db
		UserResponseDTO dto = new UserResponseDTO();
		BeanUtils.copyProperties(persistentUser, dto);//for sending resp : copied User--->User resp DTO
		return dto;
	}

}
