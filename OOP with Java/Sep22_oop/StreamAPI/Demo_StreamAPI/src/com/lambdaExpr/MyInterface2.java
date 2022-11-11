package com.lambdaExpr;

public interface MyInterface2 {

	//SAM
	void add(int i,int j);
	
	default void display()
	{
		System.out.println("MyInterface2.display()");
	}
}
