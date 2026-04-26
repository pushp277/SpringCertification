package com.wmware.certification.practice.revision.module4.unitTest.controller;

import com.wmware.certification.practice.revision.module4.unitTest.Service.OrderService;
import com.wmware.certification.practice.revision.module4.unitTest.Service.PaymentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import com.wmware.certification.practice.revision.module4.unitTest.controllers.Controller;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.net.ssl.SSLEngineResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private OrderService orderService;


    @Test
    public void order() throws Exception{
        Mockito.when(orderService.order()).thenReturn("mock payment");

        mockMvc.perform(get("/api/learn/test")).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.data").value("mock payment"));

    }

}
