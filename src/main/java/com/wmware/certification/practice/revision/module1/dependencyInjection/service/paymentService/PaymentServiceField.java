package com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService;

import com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Raj, Pushp
 * Implementation of Field Injection
 */
@Service
public class PaymentServiceField {

    @Autowired
    private Payment payment;

    public void makePayment(){
       payment.pay();
    }
}
