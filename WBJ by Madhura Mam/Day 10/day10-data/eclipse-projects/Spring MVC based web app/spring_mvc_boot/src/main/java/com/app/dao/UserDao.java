package com.app.dao;

import com.app.pojos.User;

public interface UserDao {
	User authenticateUser(String email, String pwd);
}
