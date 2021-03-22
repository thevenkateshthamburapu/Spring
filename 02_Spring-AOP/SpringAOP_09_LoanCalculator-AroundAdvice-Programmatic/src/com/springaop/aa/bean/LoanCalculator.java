package com.springaop.aa.bean;

public class LoanCalculator {
	
	public double computeRi(double p, int t, double r) {
		System.out.println("computeRi executed...");
		return (p * t * r) / 100;
	}

}
