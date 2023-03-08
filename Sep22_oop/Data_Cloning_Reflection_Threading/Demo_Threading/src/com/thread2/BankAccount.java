package com.thread2;

public class BankAccount {

	private double balance;

	public BankAccount(double amount) {
		this.balance = amount;
	}

	public synchronized void withdraw(double amount) throws InterruptedException {
		System.out.println("---withdarw amount started by:" + Thread.currentThread().getName());
		if (balance < amount) {
			Thread.sleep(1000);
			System.out.println("waiting for some deposite.......");

			super.wait();
		}
		this.balance = this.balance - amount;
		System.out.println("After Withdraw:" + balance);
		System.out.println("---withdarw amount Ended by:" + Thread.currentThread().getName());

	}

	public synchronized void deposite(double amount) {
		System.out.println("---deposite amount started by:" + Thread.currentThread().getName());

		this.balance = this.balance + amount;
		System.out.println("After deposite:" + balance);
		System.out.println("---deposite amount Ended by:" + Thread.currentThread().getName());
		super.notify();
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

}
