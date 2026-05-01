package com.wmware.certification.practice.revision.module5.unitTest.Service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService;
    public OrderService(PaymentService paymentService){
       this.paymentService = paymentService;
    }

    public String order(){
        System.out.println("Ordering...");
        return paymentService.pay();
    }
}
