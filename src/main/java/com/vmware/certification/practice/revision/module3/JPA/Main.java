package com.vmware.certification.practice.revision.module3.JPA;

import com.vmware.certification.practice.revision.module3.JPA.repositories.service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * Topic covered -> Propagation and Isolation
 */
@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();

        service repo = context.getBean(service.class);

        repo.addUser(3,"Raju", "Mizonokuchi");
       // System.out.println(repo.findById(3));
    }
}
