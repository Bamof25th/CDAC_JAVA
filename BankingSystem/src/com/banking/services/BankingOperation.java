package com.banking.services;


public interface BankingOperation {
	String openBankAccount(int acno , String fName , String Lname , double balance , String accType, String dob);
	void displayAllAccounts();
	void addMoney(int idx , double paise);
	void DoWithdrawl(int idx , double paise);
}
