package com.vmware.certification.practice.revision.module4.springboot;

import jakarta.persistence.EntityManager;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Raj, Pushp
 */
@SpringBootApplication
@ConditionalOnBean
public class Main {
    public static void main(String[] args) {
        SpringApplication context = new SpringApplication(Main.class);
        context.setBannerMode(Banner.Mode.OFF);
         context.run(args);

    }

}
