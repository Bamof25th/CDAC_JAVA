package com.banking.utils;

import com.banking.Exceptions.BalanceException;

public class BalanceValidator {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

	public static void validateBankAcc(double balance) throws BalanceException {

		if (MIN_BALANCE > balance) {
			throw new BalanceException("Balance Low Please Add Money to Continue!!!");
		}
		System.out.println("Please Add Money to continue");

	}

}
