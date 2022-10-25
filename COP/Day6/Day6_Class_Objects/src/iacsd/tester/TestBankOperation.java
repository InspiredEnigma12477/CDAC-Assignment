package iacsd.tester;

import java.util.Arrays;
import java.util.Scanner;

import iacsd.axisbank.BankAccount;package iacsd.tester;

import java.util.Arrays;
import java.util.Scanner;

import iacsd.axisbank.BankAccount;

public class TestBankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];//
		System.out.println(arr.hashCode());
		for(int i: arr)
			System.out.print(i+"   ");
		
		
		
		arr[0]=90;
		
		System.out.println();
		BankAccount accounts[] =new BankAccount[5];
		System.out.println(accounts.hashCode());
		
	for(BankAccount b:accounts)
		System.out.print(b+"   ");
		
		
		BankAccount obj1=new BankAccount("Sham", "A", "w", 90000);
		System.out.println(obj1.hashCode());
		
		//accounts[0]=obj1;
		
		for(BankAccount b:accounts)
			{
			if(b!=null)
			{
			
			b.showAccount();
			}
			}
			
		System.out.println("-----------------------");
		
		//aacept account details by user
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<accounts.length;i++)
		{
			System.out.println("Enter  Name Address Email Balanace:");
			String nm=sc.next();
			String add=sc.next();
			String email=sc.next();
			double balance=sc.nextDouble();
			BankAccount obj=new BankAccount(nm, add, email, balance);
		   accounts[i]=obj;
		   //b.showAccount();
		}
		
		System.out.println("------------show name-----------");
		for(BankAccount b:accounts)
		{
			System.out.println(b.getName());
		}
		
		System.out.println("------------show email-----------");
		for(BankAccount b:accounts)
		{
			System.out.println(b.getEmail());
		}
		
		
		System.out.println("------------show balanace-----------");
		for(BankAccount b:accounts)
		{
			System.out.println(b.getBalance());
		}
		
		System.out.println("Enter Name To Serach:");
		String nm=sc.next();
		
		for(BankAccount b:accounts)
		{
			if(b.getName().equals(nm))
				b.showAccount();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


public class TestBankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];//
		System.out.println(arr.hashCode());
		for(int i: arr)
			System.out.print(i+"   ");
		
		
		
		arr[0]=90;
		
		System.out.println();
		BankAccount accounts[] =new BankAccount[5];
		System.out.println(accounts.hashCode());
		
	for(BankAccount b:accounts)
		System.out.print(b+"   ");
		
		
		BankAccount obj1=new BankAccount("Sham", "A", "w", 90000);
		System.out.println(obj1.hashCode());
		
		//accounts[0]=obj1;
		
		for(BankAccount b:accounts)
			{
			if(b!=null)
			{
			
			b.showAccount();
			}
			}
			
		System.out.println("-----------------------");
		
		//aacept account details by user
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<accounts.length;i++)
		{
			System.out.println("Enter  Name Address Email Balanace:");
			String nm=sc.next();
			String add=sc.next();
			String email=sc.next();
			double balance=sc.nextDouble();
			BankAccount obj=new BankAccount(nm, add, email, balance);
		   accounts[i]=obj;
		   //b.showAccount();
		}
		
		System.out.println("------------show name-----------");
		for(BankAccount b:accounts)
		{
			System.out.println(b.getName());
		}
		
		System.out.println("------------show email-----------");
		for(BankAccount b:accounts)
		{
			System.out.println(b.getEmail());
		}
		
		
		System.out.println("------------show balanace-----------");
		for(BankAccount b:accounts)
		{
			System.out.println(b.getBalance());
		}
		
		System.out.println("Enter Name To Serach:");
		String nm=sc.next();
		
		for(BankAccount b:accounts)
		{
			if(b.getName().equals(nm))
				b.showAccount();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
