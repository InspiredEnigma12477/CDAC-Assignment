package com.code;

public class Employee {

	
	private int empid;
	private String name;
	private double salary;
	public Employee()
	{
		System.out.println("--- emp default constr-----");
		empid=101;
		name="Ram";
		salary=10000;
	}
	
	
	
	public Employee(int empid, String name, double salary) {
		super();//
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}



	public void display() {
		System.out.println("Employee display function");
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		//deptno
	}
	public void calIncomeTax()
	{
		System.out.println("Employee calIncomeTax");
	}
	
	
	
	
	
	
	
}
