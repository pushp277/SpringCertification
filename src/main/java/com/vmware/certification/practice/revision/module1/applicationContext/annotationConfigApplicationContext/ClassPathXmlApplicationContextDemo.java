package com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.registerShutdownHook();
    }
}
