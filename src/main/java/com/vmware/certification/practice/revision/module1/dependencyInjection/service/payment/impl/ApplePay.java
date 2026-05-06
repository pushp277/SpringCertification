package com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.impl;

import com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ApplePay implements Payment {

    @Override
    public void pay(){
        System.out.println("Paying using ApplePay");
    }
}
