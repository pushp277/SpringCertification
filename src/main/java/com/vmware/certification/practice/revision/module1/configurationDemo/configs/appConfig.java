package com.vmware.certification.practice.revision.module1.configurationDemo.configs;

import com.vmware.certification.practice.revision.module1.configurationDemo.beans.Bean1;
import com.vmware.certification.practice.revision.module1.configurationDemo.beans.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Configuration(proxyBeanMethods = false)
public class appConfig {

    @Bean
    public Bean1 bean1(){
        return new Bean1();
    }

    @Bean
    public Bean2 bean2(){
        Bean1 bean1 = bean1(); //notice bean1 method is being called
        bean1.check();
        return new Bean2();
    }

}
