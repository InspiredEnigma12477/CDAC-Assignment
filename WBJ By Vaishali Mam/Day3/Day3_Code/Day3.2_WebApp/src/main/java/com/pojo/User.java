package com.pojo;

public class User {
//userid | custName | city   | email           | password
	
	private int userid;
	private String custName,city,email,password;
	
	public User(int userid, String custName, String city, String email, String password) {
		super();
		this.userid = userid;
		this.custName = custName;
		this.city = city;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", custName=" + custName + ", city=" + city + ", email=" + email
				+ ", password=" + password + "]";
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	
	
	
	
}
