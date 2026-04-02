package com.wmware.certification.practice.revision.module1.beanScopeDemo.prototypeInjectedInSingletonBean.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * demostate how to inject Prototyped Bean inside Singleton Bean
 * @see PrototypedBean
 * @see SingletonBean
 */
@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();
        SingletonBean singletonBean = (SingletonBean) context.getBean("singletonBean");

        singletonBean.callPrototype();
        singletonBean.callPrototype();
        singletonBean.callPrototype();
    }


}
