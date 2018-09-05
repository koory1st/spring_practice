package com.koory1st.spring.aop.schema.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
    public void before() {
        System.out.println("MoocAspect before");
    }

    public void afterReturning(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect afterReturning");
        System.out.println(joinPoint.toString());
    }

    public void afterThrowing(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect afterThrowing");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect after");
        System.out.println(joinPoint.toString());
    }

    public Object doBasicProfiling(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("doBasicProfiling 1");
        Object retVal = proceedingJoinPoint.proceed();
        System.out.println("doBasicProfiling 2");
        return retVal;
    }

    public Object aroundInit(ProceedingJoinPoint proceedingJoinPoint, String bizName, int times) throws Throwable {
        System.out.println(bizName + " " + times);
        System.out.println("aroundInit 1");
        Object retVal = proceedingJoinPoint.proceed();
        System.out.println("aroundInit 2");
        return retVal;
    }
}
