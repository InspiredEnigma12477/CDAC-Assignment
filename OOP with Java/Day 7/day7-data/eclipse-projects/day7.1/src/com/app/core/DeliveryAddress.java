package com.app.core;

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
	
}
