package com.lambdaExpr;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyClass m=new MyClass();
		m.show();
		
		MyInterface1 mi=new MyInterface1() {
			
			@Override
			public void show() {
		System.out.println("inside annonymous class");
			}
		};
		mi.show();
		
		
		
		//FP: lambda expression
		//Functional Interface
		
		
		
		MyInterface1 mi2=()->System.out.println("Thhis is Show.....");;
		
		mi2.show();
		
		
		
		
		//
		MyInterface2 mi3=( i, j)->System.out.println("Add="+(i+j));
		
		mi3.add(90, 10);
		
		
		
		
		
		
	}

}
