package com.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.aop.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("Before Logging...");
    }

    @After("execution(* *.*.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Logging...");
    }

}
