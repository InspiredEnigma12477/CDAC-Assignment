package com.app.service;

import com.app.pojos.User;

public interface UserService {
//add B.L method for user validation
	User authenticateUser(String em, String pass);

	String addUserDetails(User user);

	// get user details
	User getUserDetails(long userId);
}
