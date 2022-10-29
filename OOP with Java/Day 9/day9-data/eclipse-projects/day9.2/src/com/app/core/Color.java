package com.app.core;

public enum Color {
	
	WHITE(5000), BLACK(7000), GREY(4000), SILVER(7500), RED(10000);
	//can u add a state to enum ? yes
	private double additionalCost;
	//add parameterized ctor : impl. private

	 Color(double additionalCost) {
		 //super(nm,ordinal);
		this.additionalCost = additionalCost;
	}
	 //methods : yes 

	public double getAdditionalCost() {
		return additionalCost;
	}

	public void setAdditionalCost(double additionalCost) {
		this.additionalCost = additionalCost;
	}
}


