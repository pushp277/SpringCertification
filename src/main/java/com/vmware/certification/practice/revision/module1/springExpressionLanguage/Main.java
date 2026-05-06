package com.vmware.certification.practice.revision.module1.springExpressionLanguage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * Demo for SpEL
 * @see SpELComponent
 */
@ComponentScan
public class Main {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        SpELComponent component = (SpELComponent) context.getBean("spELComponent");


       component.print();
    }
}
