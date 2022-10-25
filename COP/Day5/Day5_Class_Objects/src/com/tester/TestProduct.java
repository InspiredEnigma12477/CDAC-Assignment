package com.tester;

import java.util.Scanner;

import com.code.Product;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Product p1=new Product(101, "Pen", 10);
		p1.display();
		System.out.println("Change Name:");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		p1.setPname(str);
		System.out.println("Changed Name:"+p1.getPname());
		p1.display();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
