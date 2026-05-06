package com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationPointcut {
}
