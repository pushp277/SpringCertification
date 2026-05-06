package com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import org.springframework.stereotype.Component;

@Component
public class ArgsJoinPoint {

    public void argsJoinPointMethod1(String name){
       System.out.println("argsJoinPointMethod1 is being called: "+name);
    }
}
