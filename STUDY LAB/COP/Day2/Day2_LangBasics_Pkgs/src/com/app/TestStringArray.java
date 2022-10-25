package com.app;

import java.util.Scanner;

public class TestStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names=new String[5];
		Scanner sc=new Scanner(System.in);
		
		for(String str:names)
		{
			System.out.print(str+"  ");
		}
		System.out.println("Enter Name:");
		for(int i=0;i<names.length;i++)
		{
			names[i]=sc.next();
		}
		
		for(String str:names)
		{
			System.out.print(str.toUpperCase()+"  ");
		}
		System.out.println("\n Enter Name:");
		String nm=sc.next();
		
		for(int i=0;i<names.length;i++)
		{
			if(names[i].equals(nm))
				System.out.println("present");
			else
				System.out.println("not present");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
