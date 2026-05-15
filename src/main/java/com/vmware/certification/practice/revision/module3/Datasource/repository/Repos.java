package com.vmware.certification.practice.revision.module3.Datasource.repository;

import com.vmware.certification.practice.revision.module3.Datasource.models.Learn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.RowSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 * @author Raj, Pushp
 * Demostrate
 */
@Repository
public class Repos {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //PreparedStatementCeator and RowMapper callback is being used
    public List<Learn> getUsers(){
        return jdbcTemplate.query(psc->{
            PreparedStatement ps = psc.prepareStatement("select * from Learn");
            return ps;
        }, (rs, idx)-> {
                Learn learn = Learn.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                return learn;
            });
    }


    //ResultSetExtractor
    public Learn getUser(){
        return jdbcTemplate.query("select * from learn" , rs-> {
            Learn learn = null;
            if(rs.next()){
                learn = Learn.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
            }
            return learn;
        });
    }

    //Demonstrate RowCallbackHandler
    public void logUsers(){
        jdbcTemplate.query("select * from learn", (rs)-> {
                System.out.println(rs.getString("name") +" "+rs.getInt("id"));
        });
    }

    //Demonstrate BulkUpdate
    public void bulkUpdate(){
        List<Learn> users = List.of(new Learn(1, "Pushp Raj"),
                new Learn(2, "Saurabh"),
                new Learn(3, "Rohan"),
                new Learn(4, "Vikrant"),
                new Learn(5, "Harshit"));

        jdbcTemplate.batchUpdate("insert into learn (id, name) values (?, ?)",users,
                users.size(),
                (bps, learn) -> {
                    bps.setInt(1,learn.getId());
                    bps.setString(2, learn.getName());
                }
        );
    }
    public void updateMethod(){
        jdbcTemplate.update("insert into learn (id, name) values " +
                "(1, 'Pushp Raj");
    }

    //Demonstrate query for list
    //It accepts only single column will throw IncorrectResultSetColumnCountException
    public List<String> listMapper(){
        return jdbcTemplate.queryForList("select name from learn", String.class);
    }

    //Demonstrate query for map
    public Map<String, Object> mapMapper(){
        return jdbcTemplate.queryForMap("select id, name from learn where id = 1");
    }

    //Demonstrate query for RowSet
    public void rowSet(){
       SqlRowSet srs = jdbcTemplate.queryForRowSet("select * from learn");

        while(srs.next()){
            System.out.print("id: "+srs.getInt("id"));
            System.out.println(" name: "+srs.getString("name"));
        }
    }


}
