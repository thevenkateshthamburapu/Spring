package com.springaop.aa.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		String methodName = mi.getMethod().getName();
		Object[] args = mi.getArguments();
		System.out.println("Method Name : " + methodName);
		System.out.println("Method args : " + Arrays.toString(args));

		// changing target method parameters
		args[0] = 50;
		args[1] = 100;

		System.out.println("-----Invoking target start --------");
		// To invoke Target method or control goes to target
		Object retVal = mi.proceed();
		System.out.println("-----Invoking target end --------");

		System.out.println("Target method retval : " + retVal);

		// Modifying returned value
		retVal = 250;

		return retVal;
	}

}
