package com.tester;

import com.code.Student;

public class TestStudent {

	
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		// to access static method use class name ClassName.method()
		
//		Student.showCollageName();

		//disp();
		
		 Student s1=new Student(1, "Abc");

		s1.display();//instance method(non-static methods) require instance of class
		
		Student s2=new Student(2, "Xyz");
		s2.display();
		
		Student.changeName("DY Patil");
		Student s3=new Student(3, "ijk");
		s3.display();//
		
		s2.display();
		s1.display();
		//Student.showCollageName();//

	}
	
	
	//java TestStudent
	
	
	
	
	
	
	
	
	
	
	
	

}
