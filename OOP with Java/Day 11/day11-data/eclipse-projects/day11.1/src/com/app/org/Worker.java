package com.app.org;

public class Worker extends Emp {

	public Worker(String name) {
		super(name);
		
	}

	@Override
	public String toString() {
		return "Worker "+super.toString();
	}

	@Override
	public void work() {
		System.out.println("Worker "+getName()+" working!");
	}
	
	
}
