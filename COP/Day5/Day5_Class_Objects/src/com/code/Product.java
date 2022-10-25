package com.code;

public class Product {
	private int prdId;
	private String pname;
	private double price;
	private int[] arr;
	public Product(int prdId, String pname, double price) {
	
		this.prdId = prdId;
		this.pname = pname;
		this.price = price;
		
	}
	public void display()
	{
		System.out.println(prdId+"   "+pname+"   "+price);
	}
	
	//change pname
	//write a method  to assign value to pname(data member)
	//public void setXXX(datatype var)
	
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	
//retrive value of individual data member
	//use getter
	
	public String getPname()
	{
		return pname;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
