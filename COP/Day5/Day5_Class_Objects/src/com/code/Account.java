package com.code;

public class Account {
	private int actid;
	private String name;
	private double balance;
	public static String bankName;
	private static int actIdCounter;
	
	static
	{
		System.out.println("---static----");
	actIdCounter=1001;
		bankName="Axis Bank";
	}
	
	public Account(String name,double balance)
	{
		System.out.println("---para constr---");
		this.actid=actIdCounter;
		this.name=name;
		this.balance=balance;
		actIdCounter++;
		
	}
	
	public void show()
	{
		System.out.println(actid+" "+name+" "+balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
