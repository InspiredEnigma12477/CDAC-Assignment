package pojos;

import java.sql.Date;

public class User {
//id | name    | email          | password | reg_amt | reg_date   | role 
	private int userId;
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date regDate;
	private String role;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int userId, String name, String email, String password, double regAmount, Date regDate, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", regAmount=" + regAmount
				+ ", regDate=" + regDate + ", role=" + role + "]";
	}
	
}
