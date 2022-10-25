package com.code;

public class Employee {

	//private 
	private  int empid;//instance variable
	private String name,address,email;
	private int age;
	private double salary;	
	//default constr
	public Employee()
	{
		System.out.println("-----default constr--------");
		empid=10;
		name="Ram";
		address="pune";
		salary=50000;
		email="abc@abc.com";
		age=30;
	}
	//parametrised constr
	
	public Employee(int empid,String name,String address,String email ,int age,double salary)
	{
		System.out.println("---parameterised constr-----");
		this.empid=empid;
		this.name=name;
		this.address=address;
		this.age=age;
		this.email=email;
		this.salary=salary;
	}
	
	public void printEmployeeDetails()
	{
		int c=10;
		System.out.println(this.empid+"  "+name+"  "+address+"  "+email+"  "+age+"  "+salary);
		System.out.println(this.hashCode());
	}
	
	
	
}
