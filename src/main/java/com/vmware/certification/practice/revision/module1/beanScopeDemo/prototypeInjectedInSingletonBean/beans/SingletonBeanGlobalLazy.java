package com.vmware.certification.practice.revision.module1.beanScopeDemo.prototypeInjectedInSingletonBean.beans;

import org.springframework.stereotype.Component;

@Component
public class SingletonBeanGlobalLazy {

    public SingletonBeanGlobalLazy(){
        System.out.println("SingletonBeanGlobalLazy is initiated ");
    }
}
