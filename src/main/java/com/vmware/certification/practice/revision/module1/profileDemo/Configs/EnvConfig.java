package com.vmware.certification.practice.revision.module1.profileDemo.Configs;

import com.vmware.certification.practice.revision.module1.profileDemo.Beans.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("env")
public class EnvConfig {

    @Bean
    public Bean1 bean1(){

        return new Bean1("env profile");
    }
}
