package com.bean;

public class Product {
//
	private int prdid;
	private String name;
	private double price;
	public int getPrdid() {
		return prdid;
	}
	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int prdid, String name, double price) {
		super();
		this.prdid = prdid;
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [prdid=" + prdid + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
