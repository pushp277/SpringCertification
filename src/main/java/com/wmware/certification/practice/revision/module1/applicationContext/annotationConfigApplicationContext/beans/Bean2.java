package com.wmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean2 implements InitializingBean, DisposableBean {
    public Bean2(){
        System.out.println("Bean2 is instantiated");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("configured Bean2 via InitializingBean#afterPropertiesSet");
    }

    @Override
    public void destroy(){
       System.out.println("destroyed Bean2 via DisposableBean#destory");
    }

    public void initBean2(){
        System.out.println("initiated via initMethod of Bean annotation");
    }

    public void destroyBean2(){
        System.out.println("destroy Bean2 via destroy method of Bean annotation");
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean2 is initiated by Post Construct Annotation");
    }

    public void runner(){
        System.out.println("Runner Method of Bean2");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Bean2 is destroyed by Pre Destroy Annotation");
    }
}
