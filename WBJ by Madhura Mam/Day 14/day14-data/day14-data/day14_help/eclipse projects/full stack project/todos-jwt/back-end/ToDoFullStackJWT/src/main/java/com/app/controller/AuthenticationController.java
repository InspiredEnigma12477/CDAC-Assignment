package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.AuthenticationResponse;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {
	@GetMapping
	public AuthenticationResponse authenticateUser(HttpServletRequest request)
	{
		//due to sec filters , user's request will reach here iff basic authentication 
		//using authorization header has worked as per username n pwd 
		//added in app property file
		System.out.println("in auth user "+request.getHeader("authorization"));			
		return new AuthenticationResponse("Successful Authentication");
	}
}
