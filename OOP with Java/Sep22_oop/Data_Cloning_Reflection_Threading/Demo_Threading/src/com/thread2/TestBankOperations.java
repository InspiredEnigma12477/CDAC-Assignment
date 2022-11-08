package com.thread2;

public class TestBankOperations {

	public static void main(String[] args) {
	
	final	BankAccount act=new  BankAccount(1000);
		
		//withdraw(2000)---->3000
		//deposite(4000)----->7000
		
		BankOp1 t1=new BankOp1(act);
		t1.setName("BankOp1");
		
		BankOp2 t2=new BankOp2(act);
		t2.setName("BankOp2");
		
		t1.start();
		t2.start();
		
		//
		//
		
		
		

	}

}
