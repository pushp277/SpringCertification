package com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * Within demo is begin implemented
 */

@Component
public class WithinJoinPoint {

    public void withinMethod1(){
        System.out.println("withinMethod1 is being called");
    }

    public void whtinMethod2(String temp){
        System.out.println("withinMethod2 is begin called");
    }
}
