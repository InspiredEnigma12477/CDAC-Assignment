package com.app.service;

import javax.validation.Valid;

import com.app.dto.UserDTO;
import com.app.dto.UserRegResponse;

public interface UserService {

	UserRegResponse registerUser(UserDTO user);

}
