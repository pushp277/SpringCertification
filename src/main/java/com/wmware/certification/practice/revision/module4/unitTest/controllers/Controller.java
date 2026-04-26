package com.wmware.certification.practice.revision.module4.unitTest.controllers;


import com.wmware.certification.practice.revision.module4.unitTest.Service.OrderService;
import com.wmware.certification.practice.revision.module4.unitTest.model.Output;
import jakarta.servlet.http.HttpServletResponse;
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
