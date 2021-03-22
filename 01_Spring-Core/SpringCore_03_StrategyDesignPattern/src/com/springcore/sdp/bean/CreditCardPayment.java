package com.springcore.sdp.bean;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean pay(double amt) {
		System.out.println("Paying through Credit Card..");
		// logic
		return true;
	}
}
