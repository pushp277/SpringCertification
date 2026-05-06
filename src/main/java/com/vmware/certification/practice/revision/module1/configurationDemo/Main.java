package com.vmware.certification.practice.revision.module1.configurationDemo;

import com.vmware.certification.practice.revision.module1.configurationDemo.configs.appConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * demostrate Configuration Bean and why is it special?
 * @see appConfig ;
 */
@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    }
}
