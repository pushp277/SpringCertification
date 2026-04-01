package com.wmware.certification.practice.revision.module1.beanScopeDemo.nonWeb;

import com.wmware.certification.practice.revision.module1.beanScopeDemo.nonWeb.beans.Bean1;
import com.wmware.certification.practice.revision.module1.beanScopeDemo.nonWeb.beans.Bean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * Demostrate Prototype and Singleton Scope
 */
@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

       Bean2 bean2 = (Bean2)context.getBean("bean2"); //New Bean is created every time

        Bean1 bean1 = (Bean1)context.getBean("bean1");
        context.getBean("bean1");
        context.getBean("bean1");
        bean1.getBean2Value();

    }
}
