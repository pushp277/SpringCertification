package com.vmware.certification.practice.revision.module1.beanDemo.configs;

import com.vmware.certification.practice.revision.module1.beanDemo.beans.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Raj, Pushp
 * @see Bean2 (notice it doesn't use Component annotation)
 */
@Configuration
public class BeanConfigs {

    @Bean
    public Bean2 bean2(){
        return new Bean2();
    }
}
