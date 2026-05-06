package com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.impl;

import com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;
import org.springframework.stereotype.Component;

@Component
public class PayPay implements Payment {

    @Override
    public void pay(){
        System.out.println("Paying using PayPay");
    }
}
