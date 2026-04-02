package com.wmware.certification.practice.revision.module1.beanScopeDemo.prototypeInjectedInSingletonBean.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypedBean {
    public PrototypedBean(){
        System.out.println("Prototyped Bean initiated by ObjectProvider");
        System.out.println("Prototyped Bean initated by Method Injection");
    }
}
