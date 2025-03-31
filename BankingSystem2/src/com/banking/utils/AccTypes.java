package com.banking.utils;

public enum AccTypes {
  SAVINGS(5000),
  CREDIT(12000),
  DMAT(2000),
  CURRENT(20000);

    private double minBal;

	AccTypes(double minBal) {
		this.minBal = minBal;
	}
	public double getPlanCost()
	{
		return this.minBal;
	}
	


}
