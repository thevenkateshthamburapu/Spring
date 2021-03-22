package com.springaop.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.springaop.aa.aspect.AroundAdvice;
import com.springaop.aa.bean.Calculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProxyFactory factory = new ProxyFactory();
		// Setting Target bean
		factory.setTarget(new Calculator());
		// Setting advice bean
		factory.addAdvice(new AroundAdvice());
		// Getting proxy obj
		Calculator calc = (Calculator) factory.getProxy();
		// calling business method from proxy
		int result = calc.add(10, 20);
		System.out.println("Sum : " + result);
	}

}
