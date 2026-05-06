package com.vmware.certification.practice.revision.module1.beanPostProcssorDemo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * demo for BeanPostProcessor notice when they are running
 */
@Component
public class BeanPostProcessorDemo implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object object, String beanName){
        System.out.println("Bean Is initalized using postProcessBeforeInitaization for Bean: "+beanName);
        return object;
    }

    @Override
    public Object postProcessAfterInitialization(Object object, String beanName){
        System.out.println("Bean Is initalized using postProcessAfterInitaization method for " + beanName);
        return object;
    }
}
