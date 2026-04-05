package com.wmware.certification.practice.revision.module1.configurationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * demostrate Configuration Bean and why is it special?
 * @see com.wmware.certification.practice.revision.module1.configurationDemo.configs.appConfig;
 */
@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    }
}
