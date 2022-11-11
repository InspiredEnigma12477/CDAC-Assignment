package com.tester;

public class BankAccount {
private int acctno;
private String name,city;
private double balance;
public BankAccount(int acctno, String name, String city, double balance) {
	super();
	this.acctno = acctno;
	this.name = name;
	this.city = city;
	this.balance = balance;
}
@Override
public String toString() {
	return "BankAccount [acctno=" + acctno + ", name=" + name + ", city=" + city + ", balance=" + balance + "]";
}
public int getAcctno() {
	return acctno;
}
public void setAcctno(int acctno) {
	this.acctno = acctno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}




}
