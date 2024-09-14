package org.example.evaluations.clients;

import com.stripe.param.PlanCreateParams;
import org.example.evaluations.evaluation.clients.StripePaymentGateway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
public class StripePaymentGatewayTest {

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    @Value("${fromTest}")
    private String apiKey;

    @Test
    void testGetPaymentLinkSuccess() {
        // Arrange
        stripePaymentGateway.apiKey = apiKey;

        // Act
        String subscriptionId = stripePaymentGateway.createSubscriptionForProduct("example123","example123@gmail.com",1L,"gold plan", PlanCreateParams.Interval.MONTH);

        // Assert
        assertNotNull(subscriptionId);
    }
}
