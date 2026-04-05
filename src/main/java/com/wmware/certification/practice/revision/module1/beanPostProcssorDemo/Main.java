package com.wmware.certification.practice.revision.module1.beanPostProcssorDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        CommonAnnotationBeanPostProcessor
    }
}
