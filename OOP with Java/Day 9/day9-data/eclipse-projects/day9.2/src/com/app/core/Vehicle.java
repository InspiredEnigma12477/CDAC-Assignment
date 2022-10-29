package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Accept vehicle details : chasisNo(string) : UNIQUE (PK), color(enum : Color) , 
 * basePrice(double) , manufactureDate(Date),company
 */
public class Vehicle implements Comparable<Vehicle> {
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

	// add a non static method to assign delivery adr to the vehicle : added in the outer class
	public void linkAddress(String addressLine1, String addressLine2, String city, String state, String country,
			String zip) {
		this.address=new DeliveryAddress(addressLine1, addressLine2, city, state, country, zip);
		System.out.println("delivery address assigned...");
	}
	//implement public int compareTo(Vehicle anotherVehicle)
	@Override
	public int compareTo(Vehicle anotherVehicle)
	{
		System.out.println("in compare to ");
		// this.chno < anotherVeh.chno : -1 , same : 0, this.chno >  anotherVeh.chno : +1
		return this.chasisNo.compareTo(anotherVehicle.chasisNo);
	}
	
	//inner class (non static nested class) : begins
	public class DeliveryAddress {
		private String addressLine1;
		private String addressLine2;
		private String city;
		private String state;
		private String country;
		private String zipCode;
		public DeliveryAddress(String addressLine1, String addressLine2, String city, String state, String country,
				String zipCode) {
			super();
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}
		@Override
		public String toString() {
			return "DeliveryAddress [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city
					+ ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
		}
		
	}//inner class ends

}
