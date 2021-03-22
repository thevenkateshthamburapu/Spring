package com.springaop.aa.bean;

public class BankTransaction {
	
	public void deposit(double amount, long accNo) {
		System.out.println("Account No: "+accNo+"\nAmount: "+amount);
		System.out.println("Amount credited...");
		
	}

	public void withdraw(double amount, long accno) {
		System.out.println("Account No: "+accno+"\nAmount: "+amount);
		System.out.println("Amount debited...");
	}

}
