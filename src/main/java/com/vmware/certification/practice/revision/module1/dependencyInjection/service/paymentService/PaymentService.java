package com.vmware.certification.practice.revision.module1.dependencyInjection.service.paymentService;

import com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;
import org.springframework.stereotype.Service;

/**
 * @author Raj, Pushp
 * Constructor Injection implementation
 */
@Service
public class PaymentService {
    private Payment payment;

    public PaymentService(Payment payment){
        this.payment=payment;
    }

    public void makePayment(){
       payment.pay();
    }
}
