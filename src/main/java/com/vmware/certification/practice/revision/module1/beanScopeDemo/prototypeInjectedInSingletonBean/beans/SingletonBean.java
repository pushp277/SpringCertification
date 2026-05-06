package com.vmware.certification.practice.revision.module1.beanScopeDemo.prototypeInjectedInSingletonBean.beans;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 */
@Component
public class SingletonBean {
    @Autowired
    public ObjectProvider<PrototypedBean> prototypedProvider;

    public SingletonBean(){
        System.out.println("Single Bean Initiated");
    }
    public void callPrototype(){
        prototypedProvider.getIfAvailable();
    }

    @Lookup
    public PrototypedBean methodInjection(){
        return null;
    }
}
