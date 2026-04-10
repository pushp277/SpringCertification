package com.wmware.certification.practice.revision.module2.AOP_demo.advice;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice1 {
    /*Here the advice is Before
        execution point cut expression has following components
        {Modifier}? {return Type} {declaring type}.{Method-name}(parameter_pattern) {throws_pattern}?
     */
    @Before("execution(* com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join1.JoinPoint1.*(String))")
    public void addAdvice1(){
        System.out.println("before advice from addAdvice1 (execution demo)");
    }

    /*Here the advice is After
        within point cut exression has following components
        {declaring type}
     */
    @After("within(com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join1..*)")
    public void addAdvice2(){
        System.out.println("after advice from addAdvice2(within demo)");

    }
}
