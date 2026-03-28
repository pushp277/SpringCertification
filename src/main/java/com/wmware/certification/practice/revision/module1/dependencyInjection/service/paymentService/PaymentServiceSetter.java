package com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService;

import com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;


/**
 * @author Raj, Pushp
 * Setter Injection implementation
 */
public class PaymentServiceSetter {
    private Payment payment;

    public void setPayment(Payment payment){
       this.payment = payment;
    }

    public void makePayment(){
        if(payment == null) {
            System.out.println("Payment method is not selected");
            return;
        }

        this.payment.pay();
    }
}
