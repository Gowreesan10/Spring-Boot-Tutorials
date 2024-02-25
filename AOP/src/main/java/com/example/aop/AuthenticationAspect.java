package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {

    @Pointcut("within(com.example.aop.*)")
    public void AuthenticatingPointcut(){

    }

    @Pointcut("within(com.example.aop.*)")
    public void AuthorizationPointcut(){

    }

    @Before("AuthenticatingPointcut() && AuthorizationPointcut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }
}
