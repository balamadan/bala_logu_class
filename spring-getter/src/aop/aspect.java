package aop;

import org.aspectj.lang.JoinPoint;



public class aspect {

	public void logBefore(JoinPoint joinpoint){
		System.out.println("before =======>"+joinpoint.getSignature().getName());
	}
	public void logAfter(JoinPoint joinpoint){
		System.out.println("after =======>"+joinpoint.getSignature().getName());
	}
}
