package com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext;

import com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans.Bean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * Annotation Config ApplicationCntext
 */
@ComponentScan
public class AnnotationConfigApplicationContextDemo {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextDemo.class);
        //shutDownHook reqired for Non-Web Applications
        //require to execute
        context.registerShutdownHook();

        Bean2 bean2 = (Bean2)context.getBean("bean2");
        bean2.runner();
        /*
            1. Method annotated with @PostConstruct
            2. InitializingBean#afterPropertiesSet method will execute
            3. initMethod of @Bean annotation
            4. Application will run
            5. preDestroy
            6. DisposableBean#destory method will execute
            7. destroyMethod of @Bean annotation
         */
    }
}
