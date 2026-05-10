package com.vmware.certification.practice.revision.module1.initBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * Demostrate different ways to initializint and Destroy Bean
 * @see com.vmware.certification.practice.revision.module1.initBean.beans
 */
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();
    }
}
