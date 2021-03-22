package com.springcore.iib.bean;

public class HPPrinter implements IPrinter {

	@Override
	public void print(double availableamount, double withdrawamount) {
		// TODO Auto-generated method stub
		System.out.println("Printing through HP Printer \nAmount Withdraw Sucessfully");
		System.out.println("Withdraw Amount:"+withdrawamount);
		System.out.println("Available Amount:"+availableamount);
		System.out.println("Thank You...!");
		
	}

	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		
	}



}
