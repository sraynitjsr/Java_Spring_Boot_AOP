package com.sraynitjsr.my_spring_boot_app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.sraynitjsr.my_spring_boot_app.controller.GreetingController.sayHello(..))")
    public void logBeforeSayHello(JoinPoint joinPoint) {
        System.out.println("Before calling sayHello method");
    }

    @After("execution(* com.sraynitjsr.my_spring_boot_app.controller.GreetingController.sayHello(..))")
    public void logAfterSayHello(JoinPoint joinPoint) {
        System.out.println("After calling sayHello method");
    }

    @Before("execution(* com.sraynitjsr.my_spring_boot_app.controller.GreetingController.sayBye(..))")
    public void logBeforeSayBye(JoinPoint joinPoint) {
        System.out.println("Before calling sayBye method");
    }

    @After("execution(* com.sraynitjsr.my_spring_boot_app.controller.GreetingController.sayBye(..))")
    public void logAfterSayBye(JoinPoint joinPoint) {
        System.out.println("After calling sayBye method");
    }
}
