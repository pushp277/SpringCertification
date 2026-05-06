package com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AnnotationConfigWebApplicationContextDemo {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextDemo.class);
    }
}
