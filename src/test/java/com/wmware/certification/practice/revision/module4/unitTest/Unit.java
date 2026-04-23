package com.wmware.certification.practice.revision.module4.unitTest;


import com.wmware.certification.practice.revision.module4.unitTest.Service.OrderService;
import com.wmware.certification.practice.revision.module4.unitTest.Service.PaymentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
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


