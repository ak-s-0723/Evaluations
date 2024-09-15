package org.example.evaluations.services;

import org.example.evaluations.evaluation.clients.StripePaymentGateway;
import org.example.evaluations.evaluation.dtos.PaymentIntent;
import org.example.evaluations.evaluation.services.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @MockBean
    private StripePaymentGateway stripePaymentGateway;

    @Test
    public void testCreatePaymentIntent() {
        Long amount = 100L;
        String expectedIntentId = "intent_123";

        // Mock the behavior of the StripePaymentGateway
        when(stripePaymentGateway.createPaymentIntent(amount)).thenReturn(expectedIntentId);

        // Call the method under test
        String actualIntentId = paymentService.createPaymentIntent(amount);

        // Verify the results
        assertEquals(expectedIntentId, actualIntentId);
        verify(stripePaymentGateway).createPaymentIntent(amount);
    }

    @Test
    public void testListPaymentIntents() {
        PaymentIntent intent1 = new PaymentIntent();
        intent1.setId("id1");
        intent1.setAmount(100L);

        PaymentIntent intent2 = new PaymentIntent();
        intent2.setId("id2");
        intent2.setAmount(200L);

        List<PaymentIntent> expectedIntents = Arrays.asList(intent1, intent2);

        // Mock the behavior of the StripePaymentGateway
        when(stripePaymentGateway.listPaymentIntents()).thenReturn(expectedIntents);

        // Call the method under test
        List<PaymentIntent> actualIntents = paymentService.listPaymentIntents();

        // Verify the results
        assertEquals(expectedIntents, actualIntents);
        verify(stripePaymentGateway).listPaymentIntents();
    }

    @Test
    public void testCancelPaymentIntent() {
        String id = "intent_123";
        Boolean expectedResult = true;

        // Mock the behavior of the StripePaymentGateway
        when(stripePaymentGateway.cancelPaymentIntent(id)).thenReturn(expectedResult);

        // Call the method under test
        Boolean actualResult = paymentService.cancelPaymentIntent(id);

        // Verify the results
        assertEquals(expectedResult, actualResult);
        verify(stripePaymentGateway).cancelPaymentIntent(id);
    }
}
