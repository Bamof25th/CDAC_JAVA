package com.customer.utils;

public enum Plans {
	SILVER(1000) ,
	GOLD(2000) ,
	DIAMOND(5000) ,
	PLATINUM(10000);
	
	private double planRate;

	private Plans(double planRate) {
		this.planRate = planRate;
	}

	public double getPlanRate() {
		return planRate;
	}
	
}
