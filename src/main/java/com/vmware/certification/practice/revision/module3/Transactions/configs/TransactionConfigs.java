package com.vmware.certification.practice.revision.module3.Transactions.configs;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class TransactionConfigs {

    @Bean
    public DataSource dataSource(){
        HikariDataSource hds = new HikariDataSource();
        hds.setJdbcUrl("jdbc:postgresql://localhost:5432/db");
        hds.setUsername("pushp.raj");
        hds.setPassword("test");

        return hds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds){
        return new JdbcTemplate(ds);
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(){
        return new DataSourceTransactionManager();
    }
}
