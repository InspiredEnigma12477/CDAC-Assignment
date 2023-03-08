package dao;

import pojos.User;

public interface UserDao {
//add a method to save new user details : using openSession
	String saveUserDetails(User newUser);
	//add a method to save new user details : : using getCurrentSession
		String saveUserDetailsViaGetCurrentSession(User newUser);
}
