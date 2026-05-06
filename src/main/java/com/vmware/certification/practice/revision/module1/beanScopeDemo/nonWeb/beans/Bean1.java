package com.vmware.certification.practice.revision.module1.beanScopeDemo.nonWeb.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {


    public Bean1(){
        System.out.println("Bean1 instantiated");
    }

    @Lookup
    public Bean2 methodInjection(){
        return null;
    }

    public void getBean2Value(){
        System.out.println(methodInjection().getValue());
    }
}
