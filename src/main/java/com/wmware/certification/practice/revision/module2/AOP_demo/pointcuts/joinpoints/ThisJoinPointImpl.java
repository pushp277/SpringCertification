package com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import org.springframework.stereotype.Component;

@Component
public class ThisJoinPointImpl implements ThisJoinPoint{

    @Override
    public void thisJoinPoint(){
       System.out.println("This Join Point is being called");
    }


}
