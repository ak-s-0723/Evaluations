package org.example.evaluations.clients;

import org.example.evaluations.evaluation.clients.StripePaymentGateway;
import org.example.evaluations.evaluation.dtos.PaymentIntent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
public class StripePaymentGatewayTest {

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    @Value("${fromTest}")
    private String apiKey;

    @Test
    void testCreate_List_CancelPaymentIntentsSuccess() {
        // create
        stripePaymentGateway.apiKey = apiKey;
        Long amount = 10L;

        String id = stripePaymentGateway.createPaymentIntent(amount);
        assertNotNull(id);

        // list
        List<PaymentIntent> paymentIntentList = stripePaymentGateway.listPaymentIntents();
        assertNotNull(paymentIntentList);

        // cancel
        stripePaymentGateway.cancelPaymentIntent(id);

        List<PaymentIntent> updatedPaymentIntentList = stripePaymentGateway.listPaymentIntents();
        for(PaymentIntent paymentIntent : updatedPaymentIntentList) {
            if(paymentIntent.getId().equals(id)) {
                assertEquals("canceled", paymentIntent.getStatus());
                break;
            }
        }
    }
}
