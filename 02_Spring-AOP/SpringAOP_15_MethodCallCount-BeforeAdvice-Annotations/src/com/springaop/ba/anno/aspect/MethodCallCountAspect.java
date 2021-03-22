package com.springaop.ba.anno.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.springaop.ba.anno.bean.Monitor;

@Aspect
public class MethodCallCountAspect {
	
	@Pointcut("execution(* com.springaop.ba.anno.bean.*.*(..))")
	public void methodPointCut() {

	}

	@Before("methodPointCut()")
	public void monitor(JoinPoint jp) {
		Signature sig = jp.getSignature();
		String methodName = sig.getName();
		Monitor.increment(methodName);
	}

	@Around("methodPointCut()")
	public Object log(ProceedingJoinPoint pjp) {
		Object retVal = null;
		try {
			System.out.println("before");
			retVal = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after");
		return retVal;
	}
}
	/*@Aspect-it declares the class as aspect.

	@Pointcut-it declares the pointcut expression
	
	@Before-it declares the before advice. It is applied
	before calling the actual method.

	@Around-it declares the around advice. It is applied 
	before and after calling the actual method.
*/
