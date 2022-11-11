package com.funInterfaceDemo;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionaInterface2 obj = ( a, b) -> System.out.println("Add=" + (a + b));

		obj.add(10, 40);

		
		//SAM accepting param and return values
		
		
		MyFunctionalInterface3 obj2=(str)->{ 
			System.out.println("---Dislpay Info-----");
			return "Welcome :"+str;
		};
				
				
			String name=obj2.acceptInfo("Mitesh");
			System.out.println(name);
				
				
				
				
				
				
				
				
		
		
		
	}

}
