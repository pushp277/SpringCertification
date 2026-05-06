package com.vmware.certification.practice.revision.module1.dependencyInjection.service.paymentService;

import com.vmware.certification.practice.revision.module1.dependencyInjection.service.payment.Payment;

public abstract class AbstractPaymentService {
    abstract public void injectMethod(Payment payment);
}
