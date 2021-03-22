package com.springaop.aj.anno.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import com.springaop.aj.anno.bean.Monitor;

@Aspect
public class MethodCallCountAspect {
	
	@Pointcut(value = "execution(* com.springaop.aj.anno.bean.*.*(..))")
	public void pce() {
	}

	@Order(value = 1)
	@Before(value = "pce()")
	public void monitor(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Monitor.increment(methodName);
	}

	@Around(value = "pce()")
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("Before method");
			obj = pjp.proceed();
			System.out.println("AFter method");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}

}
	
	/*@Aspect-it declares the class as aspect.

	@Pointcut-it declares the pointcut expression
	
	@Order-it specifies the order of loading the bean 
	by spring container.
	
	@Before-it declares the before advice. It is applied
	before calling the actual method.
	
	@Around-it declares the around advice. It is applied 
	before and after calling the actual method.
	*/