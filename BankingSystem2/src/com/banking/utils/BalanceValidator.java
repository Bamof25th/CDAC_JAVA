package com.banking.utils;

import com.banking.Exceptions.BalanceException;
import com.banking.main.BankAccount;

public class BalanceValidator {

	public static void validateBankAcc(double balance , BankAccount ba) throws BalanceException {

		if (ba.getAccType().getPlanCost() > balance) {
			throw new BalanceException("Balance Low Please Add Money to Continue!!!");
		}
		System.out.println("Please Add Money to continue");

	}

}
