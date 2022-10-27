package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Accept vehicle details : chasisNo(string) : UNIQUE (PK), color(enum : Color) , 
 * basePrice(double) , manufactureDate(Date),company
 */
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double basePrice;
	private Date manufactureDate;
	private String company;
	// add HAS-A relationship between Vehicle 1----->1 DeliveryAddress
	private DeliveryAddress address;
	// SDF : for parsing n formatting
	public static SimpleDateFormat sdf;// sdf=null : static data members are inited to their def values
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(String chasisNo, Color color, double basePrice, Date manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
	}

	// add overloaded ctor to create vehicle with ch no
	public Vehicle(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		String mesg = address == null ? "Address not yet assigned!" : address.toString();
		return "Vehicle chasisNo=" + chasisNo + ", color=" + color + ", netPrice="
				+ (basePrice + color.getAdditionalCost()) + ", manufactureDate=" + sdf.format(manufactureDate)
				+ ", company=" + company + " " + mesg;
	}

	@Override
	public boolean equals(Object anotherVehicle) {
		System.out.println("in vehicle's equals");
		if (anotherVehicle instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) anotherVehicle).chasisNo);
		// => not a vehicle

		return false;
	}

	public Color getColor() {
		return color;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public DeliveryAddress getAddress() {
		return address;
	}

	// add a non static method to assign delivery adr to the vehicle
	public void linkAddress(String addressLine1, String addressLine2, String city, String state, String country,
			String zip) {
		this.address=new DeliveryAddress(addressLine1, addressLine2, city, state, country, zip);
		System.out.println("delivery address assigned...");
	}

}
