package com.vmware.certification.practice.revision.module3.Datasource;

import com.vmware.certification.practice.revision.module3.Datasource.repository.Repos;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * This Demo Covers JdbcTemplates core features like
 * 1.Different templateMethods like query, queryForList, queryForMap, queryForObject, query, executes, update and batchUpdate
 * 2. Different callbacks used inside JdbcTemplate
 * @see com.vmware.certification.practice.revision.module3.Datasource.repository.Repos
 */
@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();

        Repos repos = (Repos) context.getBean(Repos.class);
        //BatchUpdate
        repos.bulkUpdate();

        //RowCallbackHandler
        repos.logUsers();

        //Demonstrate queryForList
        System.out.println(repos.listMapper());

        //Demonstrate queryForMap
        System.out.println(repos.mapMapper());

        //Demostrate rowSet
        repos.rowSet();
    }
}
