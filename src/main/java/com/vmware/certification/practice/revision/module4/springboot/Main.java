package com.vmware.certification.practice.revision.module4.springboot;

import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Raj, Pushp
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
         SpringApplication.run(Main.class, args);
    }
}
