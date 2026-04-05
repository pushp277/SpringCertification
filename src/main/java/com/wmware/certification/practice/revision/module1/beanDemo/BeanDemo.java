package com.wmware.certification.practice.revision.module1.beanDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * Demostate Bean Creating using Both the Methods via Component and Configation
 */
@ComponentScan
public class BeanDemo {
   public static void main(String[] args){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanDemo.class);
   }
}
