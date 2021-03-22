package com.springaop.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.springaop.ba.Bean.SalaryCalculator;
import com.springaop.ba.aspect.LoggingAspect;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProxyFactory factory=new ProxyFactory();
		
		factory.setTarget(new SalaryCalculator());
		
		factory.addAdvice(new LoggingAspect());
		
		SalaryCalculator sal=(SalaryCalculator) factory.getProxy();
		
		sal.computeSalary("IBM001", 50000.00);
		sal.calculateWorkingDays("IBM001");
		
	}

}
