package com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService;

import com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;

/**
 * @author Raj, Pushp
 * Interface Injection implementation
 */
public class PaymentServiceI extends AbstractPaymentService {

    private Payment payment;

    @Override
    public void injectMethod(Payment payment){
            this.payment = payment;
    }

    public void makePayment(){
        if(payment == null) {
            System.out.println("Payment method not selected");
            return;
        }

        payment.pay();
    }
}
