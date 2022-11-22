package com.app.banking;

import java.io.Serializable;
import java.time.LocalDate;

import custom_exceptions.BankingException;

import static utils.BankingUtils.validateBalance;

public class BankAccount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -6202799276799482865L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -7557377434299699295L;
	private int acctNo;
	private String customerName;
	private double balance;
	private AcctType acType;
	private transient LocalDate creationDate;

	// create a/c : ctor
	public BankAccount(int acctNo, String customerName, double balance, AcctType acType, LocalDate creationDate) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.balance = balance;
		this.acType = acType;
		this.creationDate = creationDate;
	}

	// get a/c summary
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", balance=" + balance + ", acType="
				+ acType + ", creationDate=" + creationDate + "]";
	}

	// deposit
	public void deposit(double amount) {
		this.balance += amount;
	}

	// withdraw
	public void withdraw(double amount) throws BankingException {
		validateBalance(this.balance - amount);
		this.balance -= amount;
	}

	// funds transfer
	public void transferFunds(double amount, BankAccount destAcct) throws BankingException {
		// this => src , arg => dest acct
		this.withdraw(amount);
		destAcct.deposit(amount);
	}
	// NO need of overriding of : hashCode n equals : since Key type (Integer) has
	// already followed both of the branches of the contract

	public int getAcctNo() {
		return acctNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}

	public AcctType getAcType() {
		return acType;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}	
	

}









