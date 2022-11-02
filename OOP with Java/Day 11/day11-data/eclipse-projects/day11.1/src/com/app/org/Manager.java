package com.app.org;

public class Manager extends Emp {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager "+super.toString();
	}

	@Override
	public void work() {
		System.out.println("Manager "+getName()+" working!");
	}
	
	
}
