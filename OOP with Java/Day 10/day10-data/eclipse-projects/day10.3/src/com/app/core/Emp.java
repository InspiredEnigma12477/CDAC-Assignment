package com.app.core;

public class Emp {
	private String empId;
	private String name;
	private double salary;

	public Emp(String empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	// override , inherited(from Object class) equals method : to replace ref
	// equality by UID based equality
	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if (o instanceof Emp)
			return this.empId.equals(((Emp) o).empId);
		return false;
	}
//	//to follow the mandatory part of the contract between hashCode n equals , override hashCide
	@Override
	public int hashCode()
	{
		System.out.println("in emp's hC");
		return empId.hashCode();
	}

}




