package com.banking.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.banking.main.BankAccount;

public class test3 {
public static void main(String[] args) {
	try(Scanner scn = new Scanner(System.in)){
			System.out.println("Enter a/c details - acctNo,  firstName, " + "lastName,  balance,  acctType");
			Object b1 = new BankAccount(scn.nextInt(), scn.next(), scn.next(), scn.nextDouble(), scn.next(),LocalDate.parse(scn.next()));
			System.out.println("Enter a/c details - acctNo,  firstName, " + "lastName,  balance,  acctType");
			Object b2 = new BankAccount(scn.nextInt(), scn.next(), scn.next(), scn.nextDouble(), scn.next(),LocalDate.parse(scn.next()));
				System.out.println(b1.equals(b2));
	}
	
 }
}
