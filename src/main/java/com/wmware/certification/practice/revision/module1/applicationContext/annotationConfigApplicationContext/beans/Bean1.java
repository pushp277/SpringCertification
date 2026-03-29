package com.wmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans;

public class Bean1 {
    public Bean1(){
        System.out.println("Bean1 Instantiated");
    }

    public void bean1Init(){
       System.out.println("Initiated Bean1 using Bean initMethod");
    }

    public void destroyBean(){
        System.out.println("Destroyed Bean1 using Bean destoryMethod");
    }
}
