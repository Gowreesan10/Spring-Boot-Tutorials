package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.aop.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        String args = joinPoint.getArgs()[0].toString();
        System.out.println("Before Logger : " + args);
    }

    @After("execution(* *.*.*.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After Logging...");
    }

    @Pointcut("execution(* com.example.aop.ShoppingCart.quantity(..))")
    public void AfterReturningPointcut() {
    }

    @AfterReturning(value = "AfterReturningPointcut()", returning = "retval")
    public void afterReturning(String retval) {
        System.out.println("After Returning");
    }

}
