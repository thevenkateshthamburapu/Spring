package com.springaop.ara.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method m, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Execution completed for  : " + m.getName());
		System.out.println("Target method returned : " + retVal);
		//changing the method parameters name
		retVal = 20000.00d;
	}

}
