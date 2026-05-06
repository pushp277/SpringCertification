package com.vmware.certification.practice.revision.module1.beanScopeDemo.web.beans;

import org.springframework.stereotype.Component;

@Component
public class Bean1 {
    public Bean1(){
        System.out.println("Bean1 is created");
    }
}
