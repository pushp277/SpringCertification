package com.wmware.certification.practice.revision.module1.beanPostProcssorDemo.beans;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {
    public Bean1(){
        System.out.println("Bean1 is initated");
    }

    @PostConstruct
    public void beanPostConstruct(){
        System.out.println("PostConstruct is initiated for: Bean1");
    }
}
