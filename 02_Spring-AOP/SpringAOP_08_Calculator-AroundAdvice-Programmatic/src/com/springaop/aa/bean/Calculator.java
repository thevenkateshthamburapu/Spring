package com.springaop.aa.bean;

public class Calculator {
	
	public Integer add(int i, int j) {
		System.out.println("Control came to target...");
		return i + j;
	}

}
