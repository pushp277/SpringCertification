package com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut;
import org.springframework.stereotype.Component;

@Component
@AnnotationPointcut
public class TargetAnnotationJoinPoint implements TargetAnnotation{

    @Override
    public void targetAnnotation(){
       System.out.println("targetAnnotation Join Point");
    }

    @Override
    public void execution(){
        System.out.println("execution inside targetAnnotation Join Point");
    }


}
