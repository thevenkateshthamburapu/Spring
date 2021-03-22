package com.springcore.si.bean;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean pay(Double amount, int pin) {
		// TODO Auto-generated method stub
		System.out.println("Total Amount:"+amount+"\nPaying through Debit Card..");
		return true;
	}

}
