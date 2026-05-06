package com.vmware.certification.practice.revision.module1.beanFactorPostProcessorDemo;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorDemo implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory cs){
        System.out.println("BeanFactoryPostProcessor running");
        System.out.println(cs.toString());
    }
}
