package com.vmware.certification.practice.revision.module4.springSecurtityBasics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetCall {

    @GetMapping("/")
    public String getMethodCall(){
        return ("springSecurityWelcome");
    }

    @GetMapping("/user")
    public String getMethodCallUser(){
        return "springSecurityWelcome";
    }
}
