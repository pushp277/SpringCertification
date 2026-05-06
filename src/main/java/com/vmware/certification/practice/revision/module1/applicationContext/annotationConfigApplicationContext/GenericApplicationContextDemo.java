package com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext;

import com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans.Bean3;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Raj, Pushp
 * register Bean Programmatically
 */
public class GenericApplicationContextDemo {
    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("bean3", Bean3.class);
        context.registerShutdownHook();
        context.refresh();
    }
}
