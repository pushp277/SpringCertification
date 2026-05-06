package com.vmware.certification.practice.revision.module1.propertySourceDemo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.wmware.certification.practice.revision.module1.propertySourceDemo")
@PropertySource("classpath:app.properties")
public class AppConfig {
}
