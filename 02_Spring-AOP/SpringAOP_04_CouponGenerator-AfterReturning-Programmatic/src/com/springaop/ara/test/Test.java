package com.springaop.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.springaop.ara.aspect.CouponGeneratorAdvice;
import com.springaop.ara.bean.ShoppingCart;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyFactory factory = new ProxyFactory();

		// Setting Target bean
		factory.setTarget(new ShoppingCart());

		// Setting advice bean
		factory.addAdvice(new CouponGeneratorAdvice());

		// Getting proxy obj
		ShoppingCart bean = (ShoppingCart) factory.getProxy();

		// calling business method from proxy
		bean.computeBillAmt(99797979l);
		bean.m1(88080);
	}

}
