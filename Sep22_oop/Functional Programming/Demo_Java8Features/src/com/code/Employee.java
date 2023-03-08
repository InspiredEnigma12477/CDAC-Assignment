package com.code;



public class Employee implements Cloneable{
	//data members:fields
	private int empid;
	private String name,address;
	private double salary;
	public Employee(int empid, String name, String address, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Calling Object clone method");
		//return   super.clone();//Deep cloning done by Object 
		Employee emp=new Employee(this.empid, this.name, this.address, this.salary);
		return emp;//deep cloning
		//return this;//shallow cloning
		
	}
	
	
	
	
	
	
	

}
