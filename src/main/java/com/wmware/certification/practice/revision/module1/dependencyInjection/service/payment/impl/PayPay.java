package com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.impl;

import com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;

public class PayPay implements Payment {

    @Override
    public void pay(){
        System.out.println("Paying using PayPay");
    }
}
