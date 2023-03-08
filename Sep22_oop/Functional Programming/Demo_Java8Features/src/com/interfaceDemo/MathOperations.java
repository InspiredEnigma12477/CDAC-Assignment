package com.interfaceDemo;

public class MathOperations implements MyMathInterface {

	@Override
	public void add(int i, int j) {
		System.out.println("MathOperation implements add="+(i+j));
		
	}

}
