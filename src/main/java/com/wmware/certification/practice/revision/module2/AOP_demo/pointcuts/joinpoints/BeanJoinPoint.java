package com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import org.springframework.stereotype.Component;

@Component
public class BeanJoinPoint {

    public void beanJoinPoint(){
       System.out.println("Bean Join Point method is being called");
    }
}
