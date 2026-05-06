package com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import org.springframework.stereotype.Component;

@Component
public class ArgsAnnotationJoinPoint {

    public void argsAnnotationJoinPoint(ArgsAnnotation argsAnn){
        System.out.println("args Annotation joinPoint");
    }
}
