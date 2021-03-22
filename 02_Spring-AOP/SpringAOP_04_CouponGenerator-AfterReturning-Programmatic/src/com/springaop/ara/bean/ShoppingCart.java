package com.springaop.ara.bean;

public class ShoppingCart {
	
	public double computeBillAmt(long mobileNo) {
		System.out.println("Computing the bill amount..");
		return 6500.00;
	}
	
	public double m1(long mobileNo){
		return 1500.00;
	}

}
