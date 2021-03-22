package com.springaop.ba.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAspect implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		String methodName = m.getName();
		System.out.println("Execution started for : " + methodName);
		System.out.println("Method Paramters : " + Arrays.toString(args));
		//changing method parameters 
		args[0] = "IBM0002";
		
		/*
		in test class given IBM001 but here it changed to
		IBM002 and it is reflected in output
		*/
	}

}
