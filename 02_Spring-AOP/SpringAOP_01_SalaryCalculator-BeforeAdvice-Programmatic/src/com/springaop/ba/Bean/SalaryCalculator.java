package com.springaop.ba.Bean;

public class SalaryCalculator {
	
	public void computeSalary(String empId, Double basicPay) {
		System.out.print("Net Salary For Emp Id : " + empId);
		System.out.println(" Is : " + 45000.00);
	}

	public void calculateWorkingDays(String empId) {
		System.out.println("Employee ID : "+empId);
		System.out.println("No.of working days : " + 25);
	}

}
