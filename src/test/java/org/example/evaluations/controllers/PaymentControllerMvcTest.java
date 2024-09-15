package org.example.evaluations.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.evaluations.evaluation.controllers.PaymentController;
import org.example.evaluations.evaluation.dtos.PaymentIntent;
import org.example.evaluations.evaluation.dtos.PaymentIntentRequestDto;
import org.example.evaluations.evaluation.services.IPaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@WebMvcTest(PaymentController.class)
public class PaymentControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private IPaymentService paymentService;

    @Test
    public void testCreatePaymentIntent() throws Exception {
        PaymentIntentRequestDto requestDto = new PaymentIntentRequestDto();
        requestDto.setAmount(100L);
        String response = "intent_123";

        when(paymentService.createPaymentIntent(100L)).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.post("/paymentIntent")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestDto)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(response));
    }

    @Test
    public void testGetPaymentIntents() throws Exception {
        PaymentIntent intent1 = new PaymentIntent();
        intent1.setId("id1");
        intent1.setAmount(100L);

        PaymentIntent intent2 = new PaymentIntent();
        intent2.setId("id2");
        intent2.setAmount(200L);

        List<PaymentIntent> paymentIntents = Arrays.asList(intent1, intent2);

        when(paymentService.listPaymentIntents()).thenReturn(paymentIntents);

        mockMvc.perform(MockMvcRequestBuilders.get("/paymentIntent")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value("id1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value("id2"));
    }

    @Test
    public void testCancelPaymentIntent() throws Exception {
        String id = "intent_123";
        Boolean success = true;

        when(paymentService.cancelPaymentIntent(id)).thenReturn(success);

        mockMvc.perform(MockMvcRequestBuilders.post("/paymentIntent/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(success.toString()));
    }
}
