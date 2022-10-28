package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Accept vehicle details : chasisNo(string) : UNIQUE (PK), color(string) , 
 * basePrice(double) , manufactureDate(Date),company
 */
public class Vehicle {
	private String chasisNo;
	private String color;
	private double basePrice;
	private Date manufactureDate;
	private String company;
	// SDF : for parsing n formatting
	public static SimpleDateFormat sdf;// sdf=null : static data members are inited to their def values
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(String chasisNo, String color, double basePrice, Date manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", basePrice=" + basePrice + ", manufactureDate="
				+ sdf.format(manufactureDate) + ", company=" + company + "]";
	}

	@Override
	public boolean equals(Object anotherVehicle) {
		System.out.println("in vehicle's equals");
		if (anotherVehicle instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) anotherVehicle).chasisNo);
		//=>  not a vehicle
		return false;
	}

}
