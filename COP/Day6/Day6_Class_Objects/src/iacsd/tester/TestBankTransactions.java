package iacsd.tester;

import java.util.Scanner;

import iacsd.axisbank.BankAccount;

public class TestBankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount act1=new BankAccount("Ram", "Pune", "ram@gmail.com", 90000);
		act1.showAccount();
		
		BankAccount act2=new BankAccount("Sham", "Pune", "Sham@gmail.com", 40000);
		act2.showAccount();
		
		
		System.out.println("Enter Amount To Deposite");
		Scanner sc=new Scanner(System.in);
		double amt=sc.nextDouble();
		
		act1.deposite(amt);
		
		act1.showAccount();
		act2.showAccount();
		
		//ram wants to send money to sham account
		//sender:Ram
		//reciver Sham
		System.out.println("enter amount to send ");
		amt=sc.nextDouble();
		act1.moneyTransfer(amt, act2);
		
	
		
		System.out.println("----after--------");
		act1.showAccount();
		act2.showAccount();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
