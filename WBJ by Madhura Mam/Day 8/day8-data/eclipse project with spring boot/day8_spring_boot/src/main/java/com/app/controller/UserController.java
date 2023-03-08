package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {
	public UserController() {
		System.out.println("in def ctor " + getClass());
	}

	// add req handling method to forward the clnt to login form
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form ");
		return "/users/login";// LVN --> D.S --> V.R --> /WEB-INF/views/users/login.jsp
	}

	// add req handling method for --authentication n authorization
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, 
			@RequestParam String pass,Model map) {
		System.out.println("in process login form "+email+" "+pass+" "+map);
		return "";
		
	}

}
