package tester;

import java.util.Scanner;

import code.Account;

public class TestAccount {

	
	public static void main(String[] args) {
		
		//menu 1:Create Account
		
		Account act1=new Account();
		//System.out.println(act1);
		
		act1.displayDetails();
		
		//Accept Details From user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ActId Name Balance");
		
		Account act2=new Account(sc.nextInt(), sc.next(), sc.nextDouble());
		act2.displayDetails();
		
		//Menu 2:Deposite
		System.out.println("Amount To deposite:");
		act2.deposite(sc.nextDouble());
		//Menu 3:WithDraw
		
		System.out.println("Amount To Withdraw");
		double amt=sc.nextDouble();
		act2.withdraw(amt);
		//Menu 4:Show Balance
	//	act2.balance=900000;
		act2.showBalance();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
