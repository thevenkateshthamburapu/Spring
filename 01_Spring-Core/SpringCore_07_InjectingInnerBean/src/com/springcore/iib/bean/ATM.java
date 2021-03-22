package com.springcore.iib.bean;

public class ATM {
	
	private double availableamount =40000;
	private IPrinter printer;
	
	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}
	public void withdraw(double amount){
		if(amount<=availableamount){
			availableamount=availableamount-amount;
			printer.print(availableamount,amount);
		}else{
			printer.print("*****Insuffient Funds*****");
		}
		
	}

}
