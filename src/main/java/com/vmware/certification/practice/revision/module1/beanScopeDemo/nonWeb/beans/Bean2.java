package com.vmware.certification.practice.revision.module1.beanScopeDemo.nonWeb.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * Prototype deffers from Singleton is that It's like cycle is not managed by Spring
 * New Instance is created everytime it is invoked
 */
@Component
@Scope("prototype")
public class Bean2 {
    public String value;
    public Bean2(){
        value = "Pushp";
        System.out.println("Bean2 is instantiated");
    }

    public void setValue(String temp){
        this.value = temp;
    }

    public String getValue(){
        return this.value;
    }
}
