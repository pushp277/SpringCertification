package com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut;
import org.springframework.stereotype.Component;

@Component
public class ArgsAnnotationJoinPoint {

    public void argsAnnotationJoinPoint(ArgsAnnotation argsAnn){
        System.out.println("args Annotation joinPoint");
    }
}
