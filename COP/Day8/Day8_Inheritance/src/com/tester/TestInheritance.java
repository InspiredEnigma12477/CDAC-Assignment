package com.tester;

import com.code.Employee;
import com.code.Manager;
import com.code.ParentClass;

public class TestInheritance extends Employee{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.display();
		emp.calIncomeTax();

		Manager m = new Manager();
		m.calIncentives();
		m.display();
		m.calIncomeTax();
		m.hashCode();//
		ParentClass p=new ParentClass();
	
		
		
	}

}
