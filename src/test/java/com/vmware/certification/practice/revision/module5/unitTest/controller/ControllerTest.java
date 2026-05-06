package com.vmware.certification.practice.revision.module5.unitTest.controller;

import com.vmware.certification.practice.revision.module5.unitTest.Service.OrderService;
import com.vmware.certification.practice.revision.module5.unitTest.Service.PaymentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import com.vmware.certification.practice.revision.module5.unitTest.controllers.Controller;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(Controller.class)
@Import(OrderService.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoSpyBean
    private OrderService orderService;

    @MockitoBean
    private PaymentService paymentService;


    @Test
    public void order() throws Exception{
         Mockito.when(paymentService.pay()).thenReturn("mock payment");

        mockMvc.perform(get("/api/learn/test")).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.data").value("mock payment"));

    }

}
