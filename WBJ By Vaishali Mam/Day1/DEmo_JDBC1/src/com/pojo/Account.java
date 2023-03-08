package com.pojo;

public class Account {
//id | name | type | bal
	
	private int id;
	private String name;
	private String type;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int id, String name, String type, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type + ", balance=" + balance + "]";
	}
	
	
	
	
}
