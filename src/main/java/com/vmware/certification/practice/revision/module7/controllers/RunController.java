package com.vmware.certification.practice.revision.module7.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseStatus(HttpStatus.NO_CONTENT)
public class RunController {

    @RequestMapping(path="/test")
    public void runMethod(){
    }
}
