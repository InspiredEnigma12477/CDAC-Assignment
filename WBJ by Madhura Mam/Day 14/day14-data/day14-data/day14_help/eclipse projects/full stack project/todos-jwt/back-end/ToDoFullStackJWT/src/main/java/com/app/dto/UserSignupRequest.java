package com.app.dto;

import java.util.HashSet;
import java.util.Set;


public class UserSignupRequest {
	private String userName;
	
	private String email;
	
	private String password;
	
	
	private Set<String> roles = new HashSet<>();


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Set<String> getRoles() {
		return roles;
	}


	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	

}
