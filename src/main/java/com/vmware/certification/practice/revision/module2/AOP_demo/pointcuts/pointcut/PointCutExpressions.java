package com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.pointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCutExpressions {

    /*
        Execution predicate
     */
    @After("execution(* com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints.ExecutionJoinPoint.*())")
    public void afterMethod(JoinPoint jp){
        System.out.println("after advice is being added to method: "+jp.getSignature().getName());
    }

    /*
        Within predicate
     */
    @After("within(com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints.WithinJoinPoint)")
    public void afterMethodWithin(JoinPoint jp){
        System.out.println("after advice is begin added to method: "+jp.getSignature().getName());
    }

    /*
        Within predicate
     */
    @Before("bean(beanJoinPoint)")
    public void beforeMethodBean(JoinPoint jp){
        System.out.println("before advice is being added to method: "+jp.getSignature().getName());
    }

    /*
        Args point cut is created
     */

    @Before("args(name)")
    public void argsMethodBean(JoinPoint jp, String name){
       System.out.println("before advice is being called for args Point cut: "+jp.getSignature().getName());
    }

    @Before("this(com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints.ThisJoinPoint)")
    public void thisMethodBean(JoinPoint jp){
        System.out.println("Before method with this pointcut is being called: "+jp.getSignature().getName());
    }

    @Before("target(com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints.ThisJoinPointImpl)")
    public void targetMethodBean(JoinPoint jp){
        System.out.println("Before method with target pointcut is being called: " +jp.getSignature().getDeclaringTypeName());
    }

    @Before("@annotation(com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut)")
    public void annotationMethodBean(JoinPoint jp){
        System.out.println("Before method with annotation pointcut is being called: "+jp.getSignature().getName());
    }

    @After("@within(com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut)")
    public void withinMethodBean(JoinPoint jp){
        System.out.println("After method with @within pointcut is being called: "+jp.getSignature().getName());
    }

    @AfterReturning("@args(com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut)")
    public void argsAnnotationBean(JoinPoint jp){
        System.out.println("After Returning method with @args pointcut is being called for method: "+jp.getSignature().getName());
    }

    @After("@target(com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut)")
   public void targetAnnotationBean(JoinPoint jp){
        System.out.println("After method with @target pointcut is being called for method: "+jp.getSignature().getName());
    }

}
