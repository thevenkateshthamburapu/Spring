package com.springaop.ba.bean;

public class Bank {
	
	public void deposit(long accNo, double amt) {
		System.out.println("Account Number: "+accNo+"\nAmount: "+amt);
		System.out.println("Amount Deposited successfully...");
	}

	public void withdraw(long accNo, double amt) {
		System.out.println("Account Number: "+accNo+"\nAmount: "+amt);
		System.out.println("Amount withdrawn successfully...");
	}

}
