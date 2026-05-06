package com.vmware.certification.practice.revision.module1.propertySourceDemo.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * you can perform experiments by setting different values, of app.info.source, as JVM argument, EnviromentVariable
 */
@Component
public class Bean1 {

    @Value("${app.info.source}")
    public String source;

    @PostConstruct
    public void post(){
        System.out.println("bean1 initiated and it's value is configured as per "+source);
    }
}
