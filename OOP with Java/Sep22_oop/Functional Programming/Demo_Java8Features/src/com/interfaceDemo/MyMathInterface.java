package com.interfaceDemo;

public interface MyMathInterface {

	//1.0
	int a=10;
	//can we have abstract method
	void add(int i,int j);//public abstract
	
	//adding one more abst method in i/f
	
	//create default methods
	//default methods are implemeneted methods in i/f
	
	 default void subs(int i,int j) {
		System.out.println("Implemented method in MyMathInterface:"+(i-j));
	}
	
	//java 8: static method
	
	 
	 static  int max(int i,int j)
	 {
		 System.out.println("Static Method of MyMathInterface");
		 if(i>j)
			 return i;
		 else
			 return j;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
}
