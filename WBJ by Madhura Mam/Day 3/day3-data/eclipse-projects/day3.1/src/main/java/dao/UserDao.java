package dao;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import pojos.Role;
import pojos.User;

public interface UserDao {
//add a method to save new user details : using openSession
	String saveUserDetails(User newUser);

	// add a method to save new user details : : using getCurrentSession
	String saveUserDetailsViaGetCurrentSession(User newUser);

	// add a method to get user details by it's id
	User getUserDetailsById(Integer id);
	
	// add a method to load user details by it's id
		User loadUserDetailsById(Integer id);

	// get list of all users
	List<User> getAllUsers();

	// get list of selected users
	List<User> getUsersByDateAndRole(LocalDate beginDate, LocalDate endDate, Role userRole);

	// get all user names registered under a specific role
	List<String> getUserFirstNamesByRole(Role userRole);

	// get selected properties of users , reged after a date n under a role
	List<User> getUserSomeDetailsByDateAndRole(LocalDate date, Role userRole);
	//change password 
	String changePassword(String email,String oldPwd,String newPwd);
	//apply discount
	String applyDiscount(LocalDate date,double amount);
	//delete user details
	String deleteUserDetails(Integer userId);
	//save user's image in DB
	String saveImageToDatabase(String email,String imageFilePath) throws IOException;
	//restore user's image from DB n store it in a new file
		String restoreImageFromDatabase(String email,String newImageFilePath) throws IOException;

	
	
	
	
	
	
}
