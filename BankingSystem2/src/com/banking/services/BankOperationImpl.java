package com.banking.services;

import static com.banking.utils.AgeValidator.ValidateAge;
import static com.banking.utils.BalanceValidator.validateBankAcc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.banking.Exceptions.BaException;
import com.banking.main.BankAccount;
import com.banking.utils.AccTypes;

public class BankOperationImpl implements BankingOperation {

	List<BankAccount> accounts;
	int count = 0;

	public BankOperationImpl() {
		accounts = new ArrayList<BankAccount>();
		System.out.println("ArrayList Has been created");
	}

	@Override
	public String openBankAccount(int acno, String fName, String Lname, double balance, String accType, String dob) {
		try {
			ValidateAge(LocalDate.parse(dob));
			AccTypes act = AccTypes.valueOf(accType.toUpperCase());
			BankAccount acc = new BankAccount(acno, fName, Lname, balance, act, LocalDate.parse(dob));
			accounts.add(acc);
			count++;
			return "Account Created";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public void displayAllAccounts() {
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
	}

	@Override
	public void addMoney(int acno, double paise) {
		BankAccount ba;
		try {
			ba = findByAcno(acno);
			ba.setBalance(paise + ba.getBalance());
			System.out.println("added MOney to:" + acno);
		} catch (BaException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void DoWithdrawl(int acno, double paise) {
		try {

			BankAccount ba = findByAcno(acno);
			double currBal = ba.getBalance();
			validateBankAcc(currBal, ba);
			double bal = currBal - paise;
			ba.setBalance(bal);
			System.out.println("Money Withdrawn :" + paise + "total balance left" + ba.getBalance());
			System.out.println("invalid Acno");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void transferMoney(int acno1, int acno2, double amt) {
		try {
			BankAccount ba1 = findByAcno(acno1);
			validateBankAcc(amt, ba1);
			BankAccount ba2 = findByAcno(acno2);

			ba2.AddBalance(amt);
			ba1.setBalance(ba1.getBalance() - amt);

			System.out.println(acno1 + " pe " + amt + "parpt hue!!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void closeAccount(int acno) {
		BankAccount ba = new BankAccount(acno);
		if (accounts.remove(ba))

			System.out.println("Account deleted Succefully");
	}

	@Override
	public BankAccount findByAcno(int acno) throws BaException {
		BankAccount ac1 = new BankAccount(acno);
		int idx = accounts.indexOf(ac1);
		if (idx == -1)
			throw new BaException("Invalid Acno");
		return accounts.get(idx);
	}

}
