package com.vmware.certification.practice.revision.module1.beanScopeDemo.prototypeInjectedInSingletonBean.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SingletonBeanLazy {
    public SingletonBeanLazy(){
      System.out.println("SingletonBeanLazy initiated");
    }
}
