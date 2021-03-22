package com.springaop.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.springaop.ta.aspect.ExceptionLogger;
import com.springaop.ta.bean.DepartmentDao;

public class Test {

	public static void main(String[] args) {
		
		
		ProxyFactory factory = new ProxyFactory();
		// Setting Target bean
		factory.setTarget(new DepartmentDao());
		// Setting advice bean
		factory.addAdvice(new ExceptionLogger());
		// Getting proxy obj
		DepartmentDao dao = (DepartmentDao) factory.getProxy();
		// calling business method from proxy
		dao.insert();
	}

}
	/*
	in this the exception raised in target class,the 
	exception pass to exceptionlogger class.it not handle 
	the exception it used to display the exception details
	 */