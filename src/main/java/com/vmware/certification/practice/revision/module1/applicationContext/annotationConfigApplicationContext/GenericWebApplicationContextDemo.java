package com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext;

import com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.beans.Bean2;
import org.springframework.web.context.support.GenericWebApplicationContext;

/**
 * @author Raj, Pushp
 * register Bean Programatically, GenericWebApplicationContext requires ServletContext
 */
public class GenericWebApplicationContextDemo {
    public static void main(String[] args){
        //It's need Servlet Context which is beyond the scope of Spring Certification
        GenericWebApplicationContext context = new GenericWebApplicationContext();
        context.registerBean("bean2", Bean2.class);

        context.refresh();

    }
}
