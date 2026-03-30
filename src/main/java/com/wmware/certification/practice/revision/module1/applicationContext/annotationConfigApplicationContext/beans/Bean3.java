package com.wmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * Bean3 will be discovered duing the component ApplicationConfigApplicationContextDemo
 */
@Component
public class Bean3 implements InitializingBean, DisposableBean {
    public Bean3(){
        System.out.println("Bean 3 is instantiated");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("Initialized Bean3 by AfterPropertiesSet Method");
    }

    @Override
    public void destroy(){
        System.out.println("Destroyed bean3");
    }

}
