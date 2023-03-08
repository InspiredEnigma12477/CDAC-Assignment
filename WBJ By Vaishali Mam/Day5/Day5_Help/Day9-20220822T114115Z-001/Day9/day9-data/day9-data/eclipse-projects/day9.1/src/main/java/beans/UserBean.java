package beans;

import java.sql.SQLException;

import dao.UserDaoImpl;
import pojos.User;

public class UserBean {
	private String email;
	private String password;
	private UserDaoImpl userDao;
	private User validatedUserDetails;
	//add a property to indicate status
	private String message;
	public UserBean() throws SQLException{
		// will be invoked by JSP using JSP actions
		//instance of user dao
		userDao=new UserDaoImpl();
		System.out.println("user bean created");
	}
	//setters n getters
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
	public UserDaoImpl getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	public User getValidatedUserDetails() {
		return validatedUserDetails;
	}
	public void setValidatedUserDetails(User validatedUserDetails) {
		this.validatedUserDetails = validatedUserDetails;
	}
	//add getter for reading mesg from jb ---> JSP
	public String getMessage() {
		return message;
	}
	
	//add B.L method for user login
	public String validateUser() throws SQLException
	{
		System.out.println("in validate user "+email+" "+password);//not null
		//user bean invoking dao's method
		validatedUserDetails=userDao.authenticateUser(email, password);
		if(validatedUserDetails != null) //=>login success : authentication
		{
			message="Login successful";
			//proceed to role based authorization
			if(validatedUserDetails.getRole().equals("ADMIN"))
			return "admin";
			//customer login
			return "topics";
		}
		//=> invalid login
		message="Invalid Login !!!!!!!!!!!!!!!!!, Please retry !";
		return "login";
	}
	
	

}
