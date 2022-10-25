package com.code;

public class Manager extends Employee {
private int deptno;
	public Manager() {
		//this//current
		//super//parent class
		System.out.println("manager  default constr-----");
	}
	
	public Manager(int empid,String name,double salary,int deptno) {
		//super();//default
		super(empid,name,salary);//parameter constr of emp
		this.deptno = deptno;
	}

	public void calIncentives()
	{
		System.out.println("Manager calIncentives----");
	}
	
	
}
