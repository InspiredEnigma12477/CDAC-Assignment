package bean;

import java.sql.SQLException;

import dao.UserDaoImpl;
import pojos.User;

public class UserBean {
	//
	private String username;
	private String pass;
	private User validatedUser;

	public User getValidatedUser() {
		return validatedUser;
	}

	public void setValidatedUser(User validatedUser) {
		this.validatedUser = validatedUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public UserBean() {
		super();
	}

	public String validateUser() throws SQLException {
		UserDaoImpl userDao = new UserDaoImpl();//

		validatedUser = userDao.authenticateUser(username, pass);
		if (validatedUser != null) {
			// valid
			// get role of valid user
			if (validatedUser.getRole().equals("ADMIN")) {// redirect user to admin.jsp to add new topics
				return "admin.jsp";

			} else {// redirect customer to customer.jsp page to get all topics
				return "customer.jsp";
			}

		}

		else {
			return "login.jsp";
		}

	}

}
