package com.interfaceDemo;

public class TestMyMathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		MyMathClass mathObj=new MyMathClass();
		
		mathObj.add(45, 23);
		mathObj.subs(34, 4);//accessing default methods of i/f
		
		System.out.println("------------");
		MyMathInterface obj=mathObj;
		obj.add(90, 100);
		System.out.println("-----------");
		//or
		MyMathInterface obj2=new MyMathClass();
		obj2.add(80, 80);
		
		//or
		
		//annonymous inner class
		MyMathInterface annObj=new MyMathInterface() {
			
			@Override
			public void add(int i, int j) {
			System.out.println("annonymous class implements add="+(i+j));
				
			}
		};
		
		annObj.add(909, 90);
		
		
		//how to access static methods
		//InterfaceName.methodName()
		
		System.out.println("Max="+MyMathInterface.max(45, 34));
		
		
		
		
		
		
		
	}

}
