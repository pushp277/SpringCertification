package com.wmware.certification.practice.revision.module1.propertySourceDemo;

import com.wmware.certification.practice.revision.module1.propertySourceDemo.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Raj, Pushp
 * demo of PropertySource
 * @see AppConfig
 * @see com.wmware.certification.practice.revision.module1.propertySourceDemo.beans.Bean1
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
