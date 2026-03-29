package com.wmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext;

import org.springframework.web.context.support.XmlWebApplicationContext;

public class XmlWebApplicationContextDemo {
    public static void main(String[] args){
        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("WEB-INF/applicationContext.xml");
        context.refresh();
        //SerletContainer is required
    }
}
