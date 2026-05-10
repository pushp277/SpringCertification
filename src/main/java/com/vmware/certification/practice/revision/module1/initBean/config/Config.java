package com.vmware.certification.practice.revision.module1.initBean.config;

import com.vmware.certification.practice.revision.module1.initBean.beans.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod = "beanInit", destroyMethod = "destroyBean")
    public Bean1 method(){
        return new Bean1();
    }
}
