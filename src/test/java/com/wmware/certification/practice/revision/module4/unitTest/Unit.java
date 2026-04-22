package com.wmware.certification.practice.revision.module4.unitTest;


import com.wmware.certification.practice.revision.module4.unitTest.Service.OrderService;
import com.wmware.certification.practice.revision.module4.unitTest.Service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
public class Unit {

    @MockitoBean
    private  OrderService orderService;

    @MockitoBean
    private PaymentService paymentservice;

    @Test
    public void orderItem(){
        when(OrderSer)
    }
}
