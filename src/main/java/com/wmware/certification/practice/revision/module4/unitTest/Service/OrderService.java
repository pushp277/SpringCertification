package com.wmware.certification.practice.revision.module4.unitTest.Service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService;
    public OrderService(PaymentService paymentService){
       this.paymentService = paymentService;
    }

    public String order(){
        System.out.println("Ordering...");
        paymentService.pay();
        return "Ordered";
    }
}
