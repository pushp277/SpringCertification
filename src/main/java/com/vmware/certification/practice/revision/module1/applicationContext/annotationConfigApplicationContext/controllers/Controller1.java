package com.vmware.certification.practice.revision.module1.applicationContext.annotationConfigApplicationContext.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @GetMapping("/hello")
    public ResponseEntity<Object> getConoller1(){
       ResponseEntity<Object> temp = ResponseEntity.ok("success");
       return temp;
    }
}
