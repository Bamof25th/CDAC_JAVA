package com.banking.services;

import com.banking.Exceptions.BaException;
import com.banking.main.BankAccount;

public interface BankingOperation {
	String openBankAccount(int acno , String fName , String Lname , double balance , String accType, String dob);
	void displayAllAccounts();
	void addMoney(int idx , double paise);
	void DoWithdrawl(int idx , double paise);
	void transferMoney(int acno1, int acno2, double amt);
	void closeAccount(int acno);
	BankAccount findByAcno(int acno) throws BaException;
}
