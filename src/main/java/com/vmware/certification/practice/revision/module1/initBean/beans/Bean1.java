package com.vmware.certification.practice.revision.module1.initBean.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean1 implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet(){
        System.out.println("Bean is initialized using InitializingBean#afterPropertiesSet()");
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean is initialized using @PostConstruct annotation");
    }

    @Override
    public void destroy(){
       System.out.println("Bean destroyed using DisposableBean#destory()");
    }

    @PreDestroy
    public void preBean(){
        System.out.println("Bean destroyed using @PreDestroy annotation");
    }

    public void destroyBean(){
        System.out.println("Bean destroyed using Bean(destoryMethod ='mehtod')");
    }

    public void beanInit(){
        System.out.println("Bean is initialized using @Bean(initMethod = 'methodName'')");
    }
}
