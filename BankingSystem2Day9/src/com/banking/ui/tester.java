package com.banking.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.banking.services.BankOperationImpl;

public class tester {

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {

			System.out.println("Enter the size of bank:");
			BankOperationImpl acss = new BankOperationImpl(scn.nextInt());
			boolean exit = false;

			while (!exit) {
				System.out.println("1. Open A/c 2. Display All 3.Add Balance 4.withdraw 0.Exit");
				System.out.println("Enter Option");
				switch (scn.nextInt()) {
				case 1:
					System.out.println(
							"Enter a/c details - acctNo,  firstName, " + "lastName,  balance,  acctType , dob");
					System.out.println(acss.openBankAccount(scn.nextInt(), scn.next(), scn.next(), scn.nextDouble(),
							scn.next(), scn.next()));
					break;
				case 2:
					acss.displayAllAccounts();
					break;
				case 3:
					System.out.println("/n Index , Money to Add :");
					int idx = scn.nextInt() - 1;
					double paise = scn.nextDouble();
					acss.addMoney(idx, paise);
					break;
				case 4:
					System.out.println("/n Index , Money to Withdraw:");
					idx = scn.nextInt() - 1;
					paise = scn.nextDouble();
					acss.DoWithdrawl(idx, paise);
					break;
				case 0:
					exit = true;
					System.out.println("Exitted!!");
					break;
				default:
					break;
				}
			}

		}

	}

}
