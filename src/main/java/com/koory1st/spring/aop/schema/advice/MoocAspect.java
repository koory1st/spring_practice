package com.koory1st.spring.aop.schema.advice;

import org.aspectj.lang.JoinPoint;

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
}
