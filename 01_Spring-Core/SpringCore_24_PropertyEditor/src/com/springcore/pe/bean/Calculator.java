package com.springcore.pe.bean;

public class Calculator {
	
	private AddNumber an;

	public void setAn(AddNumber an) {
		this.an = an;
	}
	public void addNumbers() {
		int result = an.sum();
		System.out.println("Result : " + result);
	}


}
