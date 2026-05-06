package com.vmware.certification.practice.revision.module1.dependencyInjection.service.paymentService;

import com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Raj, Pushp
 * Setter Injection implementation
 */
@Service
public class PaymentServiceSetter {
    private Payment payment;

    @Autowired
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
