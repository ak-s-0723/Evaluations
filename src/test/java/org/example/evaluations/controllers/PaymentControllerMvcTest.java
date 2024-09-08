package org.example.evaluations.controllers;

import org.example.evaluations.evaluation.controllers.SubscriptionController;
import org.example.evaluations.evaluation.services.ISubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(SubscriptionController.class)
public class PaymentControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ISubscriptionService paymentService;

}
