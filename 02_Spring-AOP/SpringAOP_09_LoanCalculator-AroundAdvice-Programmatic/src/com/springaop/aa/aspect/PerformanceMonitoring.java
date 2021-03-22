package com.springaop.aa.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoring implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		// call business logic
		Object retVal = mi.proceed();

		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Time taken  : " + diff + " in ms");
		
		return retVal;
	}

}
