package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {

    @Pointcut
    public void AuthenticatingPointcut(){

    }
}
