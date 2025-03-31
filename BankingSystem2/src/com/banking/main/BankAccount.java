package com.banking.main;

import java.time.LocalDate;

import com.banking.utils.AccTypes;

public class BankAccount {

	private int acno;
	private String fName;
	private String lName;
	private double balance;
	private AccTypes accType;
	private LocalDate dob;

	public BankAccount(int acno, String fName, String lName, double balance, AccTypes accType, LocalDate dob) {
		super();
		this.acno = acno;
		this.fName = fName;
		this.lName = lName;
		this.balance = balance;
		this.accType = accType;
		this.dob = dob;
	}

	public BankAccount(int acno) {
		this.acno = acno;
	}

	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", fName=" + fName + ", lName=" + lName + ", balance=" + balance
				+ ", accType=" + accType + ", dob=" + dob + "]";
	}

	public double getBalance() {
		return balance;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public AccTypes getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		AccTypes act = AccTypes.valueOf(accType);
		this.accType = act;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void AddBalance(double paise) {
		this.balance += paise;
		System.out.println("Balance Update : " + this.balance);
	}
//   @Override 
//	public boolean equals(Object anotherObj) {
//		System.out.println("overriden equal methord");
//		BankAccount	anotherAcc = (BankAccount)anotherObj;
//		if (anotherObj instanceof BankAccount) 
//		return (this.acno).equals(anotherAcc.acno);
//		
//		return false;
//	}

}
