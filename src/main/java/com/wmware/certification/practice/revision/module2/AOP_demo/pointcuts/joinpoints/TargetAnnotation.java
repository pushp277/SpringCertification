package com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import com.wmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation.AnnotationPointcut;
import org.springframework.stereotype.Component;

public interface TargetAnnotation {

    public void targetAnnotation();
    public void execution();
}
