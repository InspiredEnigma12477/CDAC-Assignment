package iacsd.tester;

import iacsd.axisbank.BankAccount;

public class TestBankAccount {
public static void main(String[] args) {
	
	
	BankAccount act1=new BankAccount("Ram", "Pune", "e@a.c", 90000);//actid=1001 idCounter:1002
	act1.showAccount();
	BankAccount act2=new BankAccount("Sham", "Pune", "s@a.co", 9000);//actid=1002 idCounter:1003
	act2.showAccount();
	
	
	act1.showAccount();
	act2.showAccount();
	
}
}
