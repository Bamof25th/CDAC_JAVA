package com.banking.ui;

import java.time.LocalDate;

import com.banking.main.BankAccount;

public class tester2 {
	public static void main(String[] args) {
	
		BankAccount b1 = new BankAccount(12, "a1", "b1", 120000, "savings",LocalDate.parse("2011-12-23"));
		BankAccount b2 = new BankAccount(12, "a1", "b1", 120000, "savings",LocalDate.parse("2011-12-23"));
		BankAccount b3 = new BankAccount(11, "a2", "b2", 140000, "savings",LocalDate.parse("2011-12-23"));
		
		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
		int b1acno = b1.getAcno();
		int b2acno = b2.getAcno();
		System.out.println(b1acno == b2acno);
		System.out.println(b1.equals(b2));
	}
}
