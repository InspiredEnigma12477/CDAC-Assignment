package com.code;

import java.util.Date;

public class TestCloning {


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(101, "Snehal", "Pune", 80000);
		//emp1.
		
		// emp.
		System.out.println("Emp1:" + emp1);

		Employee emp2 = (Employee) emp1.clone();

		System.out.println("Emp2:" + emp2);
		System.out.println("Emp1:" + emp1.hashCode());
		System.out.println("Emp2:" + emp2.hashCode());

		emp1.setName("Sonali");// change name in orignal object
		System.out.println("Emp1:" + emp1);

		System.out.println("Emp2:" + emp2);

		Date dt = new Date();
		Employee emp3 = emp1;
		 
//		 
//		 Date dt2=(Date) emp1.clone();//

	}

}
