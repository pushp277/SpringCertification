package com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import org.springframework.stereotype.Component;

@Component
public class AnnotationJoinPoint {
    public void annotationJoinPoint(){
        System.out.println("Annotation Join Point is being called");
    }
}
