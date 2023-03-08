package com.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStreamBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<BankAccount> list = BankUtil.getAllAccounts();

		System.out.println("----orignal-----");

		list.forEach(b -> System.out.println(b));

		System.out.println("---- oprations-----");
		// show all emp from city=

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter City:");
		String city = sc.next();

		// convert list into stream
		list.stream()// list--->stream
				.filter(b -> b.getCity().equals(city))// filter
				.forEach(b -> System.out.println(b));

		System.out.println("-------------------");
		list.stream()// list--->stream
				.filter(b -> b.getCity().equals(city))// filter
				.filter(p -> p.getBalance() > 70000).forEach(b -> System.out.println(b));

		System.out.println("--------------sort act by balance---------------");

		list.stream().sorted((b1, b2) -> ((Double) b1.getBalance()).compareTo(b2.getBalance()))
				.forEach(b -> System.out.println(b));

		System.out.println("--------------sum balance---------------");

	double total=0;
	for(BankAccount act: list)
	{
		total=total+act.getBalance();
	}
	System.out.println("Total="+total);
	
	//avg,max,min
	
	double total1=list.stream().mapToDouble(p->p.getBalance()).sum();
	System.out.println("Sum="+total1);
	
	
	total1=list.stream().mapToDouble(p->p.getBalance()).average().getAsDouble();
	System.out.println("Avg="+total1);
	
	
	
	
	
	
	}

}
