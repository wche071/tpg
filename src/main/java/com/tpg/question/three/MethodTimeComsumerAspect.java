package com.tpg.question.three;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MethodTimeComsumerAspect {

	@Around("execution(* com.tpg.question.three.AccountDBAcess.*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		String logHead = joinPoint.getTarget().getClass().getSimpleName() + "." + joinPoint.getSignature().getName();
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		try {
			joinPoint.proceed();
		} finally {
			end = System.currentTimeMillis();
			System.out.println("*** the method " + logHead + " total time consumer is " + (end - start) + "  milliseconds");
		}

		

	}

}
