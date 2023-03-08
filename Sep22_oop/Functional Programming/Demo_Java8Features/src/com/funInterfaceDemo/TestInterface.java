package com.funInterfaceDemo;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create obj of implemented class
		MyClassFunIf obj=new MyClassFunIf();
		obj.myFunction();
		
		//or
		
		MyFunctionalInterface obj2=new MyFunctionalInterface() {
			
			@Override
			public void myFunction() {
				System.out.println("Annonymous class implemented SAM:");
				
			}
		};
		
		obj2.myFunction();
		
		
		
		
		
		
		
		
		
		
		
	}

}
