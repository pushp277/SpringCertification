package com.vmware.certification.practice.revision.module1.dependencyInjection;

import com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.impl.ApplePay;
import com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.impl.PayPay;
import com.vmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentService;
import com.vmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentServiceField;
import com.vmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentServiceI;
import com.vmware.certification.practice.revision.module1.dependencyInjection.service.paymentService.PaymentServiceSetter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Raj, Pushp
 * Dependency Injection -> It's a software design technique where Object doesn't create dependency on itself
 * instread it declares it's dependency, and It's the role of external Object or Framework to provide
 * concrete dependency to the object
 * Constructor Injection {@link PaymentService},
 * Setter Injection {@link PaymentServiceSetter},
 * Interface Injection {@link PaymentServiceI}
 * Field Injection {@link PaymentServiceField}
 */

@ComponentScan("com.wmware.certification.practice.revision.module1.dependencyInjection")
public class Main {

    public static void main(String[] args){

        //Concreate Implementation
        System.out.println("*DI*");
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
        System.out.println("-----------------------------------");

        /* ------------------------- Spring Container Implementation--------------------------------------*/


        System.out.println("*DI using Spring framework*");
        //Using IoC Container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();

        System.out.println("__Constructor Injection__");
        PaymentService paymentServiceSpring = (PaymentService)context.getBean("paymentService");
        paymentServiceSpring.makePayment();
        System.out.println("----------------------------------");


        System.out.println("__Setter Injection__");
        PaymentServiceSetter paymentServiceSetterSpring = (PaymentServiceSetter)context.getBean("paymentServiceSetter");
        paymentServiceSetterSpring.makePayment();
       System.out.println("-------------------------------------");

       System.out.println("__Field Injection__");
        PaymentServiceField paymentServiceField = (PaymentServiceField)context.getBean("paymentServiceField");
        paymentServiceField.makePayment();
        System.out.println("---------------------------------------");
    }
}
