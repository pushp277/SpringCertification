package com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join1;

import org.springframework.stereotype.Component;

@Component
public class JoinPoint1 {


    public void callJoinPointMethod1(){
        System.out.println("JoinPointMethod1 method called");
    }
    public void callJoinPointMethod2(String temp){
        System.out.println("JoinPointMethod2 method called");
    }
}
