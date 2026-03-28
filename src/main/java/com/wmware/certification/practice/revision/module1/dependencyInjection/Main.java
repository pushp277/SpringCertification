package com.wmware.certification.practice.revision.module1.dependencyInjection;

import com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.impl.ApplePay;
import com.wmware.certification.practice.revision.module1.dependencyInjection.service.payment.impl.PayPay;
import com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentService;
import com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentServiceI;
import com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentServiceSetter;

/**
 * @author Raj, Pushp
 * Dependency Injection -> It's a software design technique where Object doesn't create dependency on itself
 * instread it declares it's dependency, and It's the role of external Object or Framework to provide
 * concrete dependency to the object
 * Constructor Injection {@link com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentService},
 * Setter Injection {@link com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentServiceSetter},
 * Interface Injection {@link com.wmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentServiceI}
 */
public class Main {

    public static void main(String[] args){
        //Demonstrating Constructor Injection
        System.out.println("__Constructor Injection__");
        PaymentService paymentService = new PaymentService(new ApplePay());
        paymentService.makePayment();
        System.out.println("-----------------------------------");

        //Demonstrating Setter Injection
        System.out.println("__Setter Injection__");
        PaymentServiceSetter paymentServiceSetter = new PaymentServiceSetter();
        paymentServiceSetter.setPayment(new PayPay());
        paymentServiceSetter.makePayment();
        System.out.println("-----------------------------------");

        //Demonstrated Interface Injection
        System.out.println("__Interface Injection__");
        PaymentServiceI paymentServiceI = new PaymentServiceI();
        paymentServiceI.injectMethod(new ApplePay());
        paymentServiceI.makePayment();
        System.out.println("-----------------------------------");
    }
}
