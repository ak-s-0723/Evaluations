package org.example.evaluations.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.evaluations.evaluation.controllers.PaymentController;
import org.example.evaluations.evaluation.services.IPaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PaymentController.class)
public class PaymentControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IPaymentService paymentService;

}
