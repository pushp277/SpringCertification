package com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut;
import org.springframework.stereotype.Component;

@Component
@AnnotationPointcut
public class WithinAnnotationJoinPoint {

    public void withinAnnotationJoinPoint(){
       System.out.println("within annotation join point");
    }
}
