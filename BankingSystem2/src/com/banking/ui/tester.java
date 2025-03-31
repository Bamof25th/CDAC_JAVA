package com.banking.ui;

import java.util.Scanner;

import com.banking.services.BankOperationImpl;

public class tester {

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			BankOperationImpl acss = new BankOperationImpl();
			boolean exit = false;

			while (!exit) {
				System.out.println("1. Open A/c 2. Display All 3.Add Balance 4.withdraw 5.Transfer Funds 6.Close Acc 0.Exit");
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
					System.out.println("/n Account Number, Money to Add :");
					int acno = scn.nextInt();
					double paise = scn.nextDouble();
					acss.addMoney(acno, paise);
					break;
				case 4:
					System.out.println("/n Account Number, Money to Withdraw:");
					acno = scn.nextInt();
					paise = scn.nextDouble();
					acss.DoWithdrawl(acno, paise);
					break;
				case 5:
					System.out.println("To transferMoney put  acno of your acc and the other acc to taansfer on (acno1 , acno2):" );
					acss.transferMoney(scn.nextInt(), scn.nextInt(), scn.nextInt());
					break;
				case 6:
					System.out.println("To Close Account please put your acno :" );
					acno =  scn.nextInt();
					acss.closeAccount(acno);
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
