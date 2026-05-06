package com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Raj, Pushp
 * Demo FileSystemXmlApplicationContext
 */
public class FileSystemXmlApplicationContextDemo {
    public static void main(String[] args){
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
    }

}
