package com.vmware.certification.practice.revision.module2.AOP_demo.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice1 {
    /*Before Advice
        execution point cut expression has following components
        {Modifier}? {return Type} {declaring type}.{Method-name}(parameter_pattern) {throws_pattern}?
        It may accept Argument of type JoinPoint
     */
    @Before("execution(* com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join1.JoinPoint1.*(String))")
    public void addAdvice1(JoinPoint jp){
        System.out.println("before advice from addAdvice1 (execution demo) "+jp.getSignature().getName());
    }

    /*Here the advice is After
        within point cut exression has following components
        {declaring type}
        It may accept Argument of type JoinPoint
     */

    @After("within(com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join1..*)")
    public void addAdvice2(JoinPoint jp){
        System.out.println("after advice from addAdvice2(within demo) "+jp.getSignature().getName());

    }

    @AfterReturning(pointcut = "within(com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join2.Join2)", returning = "temp")
    public void addReturnAdvice(JoinPoint jp, Object temp){
        System.out.println("After Returning advice is being called for method:  "+jp.getSignature().getName());
    }

    @AfterThrowing(pointcut="within(com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join2.Join2)", throwing = "ex")
    public void throwReturnAdvide(JoinPoint jp, Exception ex){
        System.out.println("After throw is being called for method: "+jp.getSignature().getName());
    }
}
