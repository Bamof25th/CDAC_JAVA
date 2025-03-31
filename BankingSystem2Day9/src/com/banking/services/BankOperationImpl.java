package com.banking.services;
import java.time.LocalDate;

import com.banking.main.BankAccount;
import static com.banking.utils.AgeValidator.ValidateAge;
import static com.banking.utils.BalanceValidator.validateBankAcc;

public class BankOperationImpl implements BankingOperation{

	BankAccount[] accounts;
    int count = 0;
    public BankOperationImpl(int size) {
    	accounts = new BankAccount[size];
    	System.out.println("Array Has been created");
    }    
	@Override
	public String openBankAccount(int acno, String fName, String Lname, double balance, String accType ,String dob) {
		try {
			ValidateAge(LocalDate.parse(dob));	
		if (count< accounts.length) {
			accounts[count] = new BankAccount(acno, fName, Lname, balance, accType, LocalDate.parse(dob));
			count++ ;
			return "Account Created";
		}else {
			return "Bank Full please go!!" ;
		}
		} catch (Exception e) {	
			return e.getMessage();
		}
	}

	@Override
	public void displayAllAccounts() {
		for (BankAccount bankAcc : accounts) {
			System.out.println(bankAcc);
		}		
	}
	@Override
	public void addMoney(int idx , double paise) {
		if(idx >= 0 && idx <= count) {
			double newBal = accounts[idx].getBalance() + paise;
			accounts[idx].setBalance(newBal);
		}else {
			System.out.println("invalid Acno");
		}
	}
	@Override
	public void DoWithdrawl(int idx , double paise) {
		try {
			
		if(idx >= 0 && idx <= count) {
			double currBal = accounts[idx].getBalance();
			validateBankAcc(currBal);
			double bal = currBal - paise;
			accounts[idx].setBalance(bal);
			System.out.println("Money Withdrawn :"+paise +"total balance left" + accounts[idx].getBalance());
		}else {
			System.out.println("invalid Acno");
		}		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
