package com.app.service;

import com.app.pojos.User;

public interface UserService {
	User validateUser(String email, String password);
}
