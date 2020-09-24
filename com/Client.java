package com;

import java.util.Scanner;

import exception.CustomException;

public class Client {
public static void main(String[] args) {
	for(;;)
	{
		System.out.println("------------Main Menu-------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Balance inquiry.");
		System.out.println("4. Create an Account");
		System.out.println("5. Transfer funds between two accounts");
		
		
		System.out.println("\n\n\nPlease choose an option [1, 2, 3, 4, 5]:");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		int accNo=0;
		float amt=0;
		AccountDao opr=new AccountDaoImpl();
		switch(option)
 {
			case 1:
				System.out.println("Enter Account No.");
				accNo = sc.nextInt();

				System.out.println("Enter Amount ");
				amt = sc.nextFloat();
				try {
					opr.deposit(accNo, amt);
				} catch (CustomException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter Account No.");
				accNo = sc.nextInt();

				System.out.println("Enter Amount ");
				amt = sc.nextFloat();
				try {
					opr.withdraw(accNo, amt);
				} catch (CustomException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter Account No.");
				accNo = sc.nextInt();

				try {
					System.out.println("balance is="
							+ opr.balanceEnquiry(accNo));
				} catch (CustomException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter Account No.");
				accNo = sc.nextInt();

				System.out.println("Enter Amount ");
				amt = sc.nextFloat();

				System.out.println("Enter Name ");
				String name = sc.next();

				try {
					opr.createAccount(accNo, amt, name);
				} catch (CustomException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				System.out.println("Enter Source Account No.");
				accNo = sc.nextInt();

				System.out.println("Enter Source Account No.");
				int desAccNo = sc.nextInt();

				System.out.println("Enter Amount ");
				amt = sc.nextFloat();

				try {
					opr.fundTransfer(accNo, desAccNo, amt);
				} catch (CustomException e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Enter Valid option");

			}
	}
}
}
