package com.wmware.certification.practice.revision.module1.profileDemo.Configs;

import com.wmware.certification.practice.revision.module1.profileDemo.Beans.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("app")
public class AppConfig {

    @Bean
    public Bean1 initiateBean(){
        return new Bean1("app profile");
    }
}
