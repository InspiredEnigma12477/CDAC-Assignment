package com.app.org;

public class Emp {
	private String name;

	public Emp(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	public void work()
	{
		System.out.println("Emp "+name+" working!");
	}

	public String getName() {
		return name;
	}
	
	

}
