package com.vmware.certification.practice.revision.module1.beanScopeDemo.web.controllers;

import com.vmware.certification.practice.revision.module1.beanScopeDemo.web.model.User;
import com.vmware.certification.practice.revision.module1.beanScopeDemo.web.model.User1;
import com.vmware.certification.practice.revision.module1.beanScopeDemo.web.model.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @Autowired
    private User user;

    @Autowired
    private User1 user1;

    @Autowired
    private User2 user2;


    @GetMapping("/demo/request")
    public String demo(Model model, @RequestParam String name, @RequestParam Long age, @RequestParam Long height){
        user.setName(name);
        user.setAge(age);
        user.setHeight(height);

        System.out.println("[DEBUG] check object: "+user);
        model.addAttribute("user", user);
        model.addAttribute("userString", user.toString());
        return "index";
    }

    @GetMapping("/demo/session")
    public String demo1(Model model, @RequestParam String name, @RequestParam Long age, @RequestParam Long height){
        user1.setName(name);
        user1.setAge(age);
        user1.setHeight(height);

        System.out.println("[DEBUG] check object: "+user1);
        model.addAttribute("user", user1);
        model.addAttribute("userString", user1.toString());
        return "index";
    }

    @GetMapping("/demo/application")
    public String demo2(Model model, @RequestParam String name, @RequestParam Long age, @RequestParam Long height){
        user2.setName(name);
        user2.setAge(age);
        user2.setHeight(height);

        System.out.println("[DEBUG] check object: "+user2);
        model.addAttribute("user", user2);
        model.addAttribute("userString", user2.toString());
        return "index";
    }
}
