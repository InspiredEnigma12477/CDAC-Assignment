package tester;

import code.MyMath;

public class TestMyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// client code

		// primitive
		// DataType variable
		int a = 10;// get stored on stack

		// to use User Def Data Type (class)
		// create object of Class
		// DataType obj;

		MyMath obj;
		// System.out.println(obj);

		obj = new MyMath();// imp
//methods need to  be called explicitly
		obj.chkEven(9);
		
		int p = obj.getMax(90, 102);
		System.out.println("Max=" + p);

		System.out.println("-----------------");
		int b = 20, c = 90;
		
		
//		obj.add(223, 34);
//		obj.add3(a,b, c);
		
		//client want to make addition of two double
		
//		obj.addDouble(90.90, 23.32);
		

obj.add(90.90, 98.99);
obj.add(1, 2,3);
obj.add(10, 12.45);		
		
		
		//obj.add(1, 2,3,4,5,6,7,8);//in class add a new overloaded method accepting 8 int
		
	//obj.add(1, 2,3,4,5,6,7,8,9,0,3,4,5,6,7,8,9,900);	


//obj.display();
//obj.addInt(12);
obj.sum();//0 parameters
obj.sum(1);//1
obj.sum(1,1);//2 parametrs

obj.sum(1,1,1,1,1,1,1,1,1,1,1,1);

obj.sum(1,2,3,4,5,6,7,8,9,01,2,3,4,5,6,7,89,0,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7);


obj.show("Abhay");
obj.show("Seema", "c","c++");
obj.show("Tejas");






	}

}
