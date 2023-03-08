package com.lambdaExpr;

@FunctionalInterface
public interface MyInterface1 {
//must have singe abstract method
	//by default public abstract
	void show();
	
	
	//can we add implemented method
	//java 8 default method
	default void display()
	{
		System.out.println("MyInterface1.display()");
	}
	//java 8 :static method
	
	
	static void print()
	{
		System.out.println("Static method print");
	}
	
	
}
