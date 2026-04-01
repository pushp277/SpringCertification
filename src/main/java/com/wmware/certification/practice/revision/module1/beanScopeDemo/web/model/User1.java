package com.wmware.certification.practice.revision.module1.beanScopeDemo.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * Implemented Model for Web Scope Demo
 * This also demostrate use
 */

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class User1 {
    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private Long height;

    @JsonProperty("age")
    private Long age;

    public static class UserBuilder{
        private String name;
        private Long height;
        private Long age;

        public UserBuilder name(String name){
             this.name = name;
             return this;
        }

        public UserBuilder height(long height){
            this.height = height;
            return this;
        }

        public UserBuilder age(long age){
            this.age = age;
            return this;
        }

        public User1 build(){
            User1 user = new User1();
            if(this.name != null)
                user.name = this.name;

            if(this.age != null)
                user.age = this.age;

            if(this.height != null)
                user.height = this.height;

            return user;
        }

    }
    public static UserBuilder builder(){
        return new UserBuilder();
    }


    public String getName(){
       return this.name;
    }

    public Long getHeight(){
        return this.height;
    }

    public Long getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(long height){
        this.height = height;
    }

    public void setAge(long age){
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name+" "+this.height+" "+this.age+": "+this.hashCode();
    }
}
