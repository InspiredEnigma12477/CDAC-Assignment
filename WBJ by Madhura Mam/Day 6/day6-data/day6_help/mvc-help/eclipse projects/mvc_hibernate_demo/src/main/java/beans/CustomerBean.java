package beans;

import javax.persistence.NoResultException;

import dao.CustomerDAO;
import pojos.Customer;

public class CustomerBean {
	private String email, pass;
	private Customer details;

	public CustomerBean() {
		System.out.println("in bean constr");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer getDetails() {
		return details;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	// B.L
	public String validateUser() throws Exception {
		try {
			details = new CustomerDAO().validateCustomer(email, pass);
		} catch (NoResultException e) {
			return "invalid";
		}
		if (details != null)
			return "valid";
		return null;

	}

}
