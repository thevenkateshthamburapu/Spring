package com.springaop.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.springaop.ara.aspect.LogAfterAdvice;
import com.springaop.ara.bean.LoanCalculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyFactory pf = new ProxyFactory();
		// Setting Target bean
		pf.setTarget(new LoanCalculator());
		// Setting advice bean
		pf.addAdvice(new LogAfterAdvice());
		// Getting proxy obj
		LoanCalculator lc = (LoanCalculator) pf.getProxy();
		// calling business method from proxy
		double i = lc.computeRi(500000, 12, 2);
		System.out.println("Loan amount :" + i);

	}

}
