package com.vmware.certification.practice.revision.module6.unitTest;


import com.vmware.certification.practice.revision.module6.unitTest.Service.OrderService;
import com.vmware.certification.practice.revision.module6.unitTest.Service.PaymentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class Unit {

    @InjectMocks
    private  OrderService orderService;

    @Mock
    private PaymentService paymentService;

    @Test
    public void orderItem(){
        when(paymentService.pay()).thenReturn("mock");
        assertEquals("mock", orderService.order());
    }
}


