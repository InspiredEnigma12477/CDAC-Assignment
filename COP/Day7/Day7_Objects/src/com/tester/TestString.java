package com.tester;

import com.code.Box;

public class TestString {
public static void main(String[] args) {
	
	int a=10;
	String str1="IACSD";
	System.out.println(str1);
	
	String str2="IACSD";
	System.out.println(str2);
	
	if(str1.equals(str2))
		System.out.println("same");
	else
		System.out.println("not same");
	
	
	
	 Box box1=new Box(50, 60, 70);
	 //System.out.println(box1);
	 box1.display();
	 Box box2=new Box(50, 60, 70);
		box2.display();
	
	System.out.println(box1.equals(box2));
	
	
	
	
	
}
}
