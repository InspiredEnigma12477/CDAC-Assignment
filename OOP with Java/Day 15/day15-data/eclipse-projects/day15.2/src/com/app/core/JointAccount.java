package com.app.core;

import static java.lang.Thread.*;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "JointAccount [balance=" + balance + "]";
	}

	// update balance : 5000 , amt 500
	public    void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName());//cust1
		balance = balance + amt;//bal=5500
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(17);//simulating user's think time!
		balance = balance - amt;
		System.out.println("Updations over by " + currentThread().getName());
	}//bal=5000

	// chk balance
	public  double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());//cust2
		Thread.sleep(37);//added it ONLY for forcing transitions (running --> blocked)
		return balance;

	}

}
