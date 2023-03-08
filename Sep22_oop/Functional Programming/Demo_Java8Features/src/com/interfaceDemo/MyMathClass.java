package com.interfaceDemo;

public class MyMathClass implements MyMathInterface{

	//this must implemets all abstract methods
	@Override
	public void add(int i, int j) {
		// TODO Auto-generated method stub
	System.out.println("MathClass implements Add="+(i+j));	
	}

	//can this class override default methods:YES
	@Override
	public void subs(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Implemented In MyMathClass sub="+(i-j));
	}

	//Can We override static method:NO
	
	
	
	
}
