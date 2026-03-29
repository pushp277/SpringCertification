package com.wmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.configuration;

import com.wmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans.Bean1;
import com.wmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Raj, Pushp
 * Configuration created for initiating beans
 */
@Configuration
public class BeanConfiguration {

    @Bean(initMethod = "bean1Init", destroyMethod = "destroyBean")
    public Bean1 bean1(){
        System.out.println("Inside Bean Configuration");
        return new Bean1();
    }

    @Bean(initMethod="initBean2", destroyMethod = "destroyBean2")
    public Bean2 bean2(){
        System.out.println("Inside Bean Configuration");
        return new Bean2();
    }
}
