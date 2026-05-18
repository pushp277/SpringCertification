package com.vmware.certification.practice.revision.module6.unitTest.controllers;


import com.vmware.certification.practice.revision.module6.unitTest.Service.OrderService;
import com.vmware.certification.practice.revision.module6.unitTest.model.Output;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Controller {

    private final OrderService orderService;

    public Controller(OrderService orderService){
       this.orderService = orderService;
    }

    @GetMapping("/api/learn/test")
    public ResponseEntity<Output> getMapping() throws IOException {
        Output output = new Output();
        output.setData(orderService.order());
        return ResponseEntity.ok(output);
    }
}
