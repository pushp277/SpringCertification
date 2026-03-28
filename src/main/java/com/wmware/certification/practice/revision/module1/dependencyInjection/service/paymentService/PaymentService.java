package com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService;

import com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;

/**
 * @author Raj, Pushp
 * Constructor Injection implementation
 */
public class PaymentService {
    private Payment payment;

    public PaymentService(Payment payment){
        this.payment=payment;
    }

    public void makePayment(){
       payment.pay();
    }
}
