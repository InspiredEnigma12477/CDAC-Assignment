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

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		if (empId == null) {
//			if (other.empId != null)
//				return false;
//		} else if (!empId.equals(other.empId))
//			return false;
//		return true;
//	}
	
	
	

	// override , inherited(from Object class) equals method : to replace ref
	// equality by UID based equality
	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if (o instanceof Emp)
			return this.empId.equals(((Emp) o).empId);
		return false;
	}
////	//to follow the mandatory part of the contract between hashCode n equals , override hashCide
	@Override
	public int hashCode()
	{
		System.out.println("in emp's hC");
		return 19*empId.hashCode();
	}
	

}




