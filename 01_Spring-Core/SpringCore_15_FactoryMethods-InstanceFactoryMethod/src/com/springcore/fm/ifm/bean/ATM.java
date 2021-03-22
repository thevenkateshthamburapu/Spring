package com.springcore.fm.ifm.bean;

public class ATM {
	
	private Printer printer;

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void printBalanceInformation(Double amount){
		System.out.println("Calculating amount....");
		printer.printBalance(amount);
	}
}