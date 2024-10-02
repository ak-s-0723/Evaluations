package org.example.evaluations.evaluation.clients;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntentCollection;
import com.stripe.param.PaymentIntentCancelParams;
import com.stripe.param.PaymentIntentCreateParams;
import com.stripe.param.PaymentIntentListParams;
import org.example.evaluations.evaluation.dtos.PaymentIntent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StripePaymentGateway {

    @Value("${stripe.key}")
    public String apiKey;

    public String createPaymentIntent(Long amount) {
        try {
            Stripe.apiKey = this.apiKey;
            PaymentIntentCreateParams params =
                    PaymentIntentCreateParams.builder()
                            .setAmount(amount)
                            .setCurrency("usd")
                            .setAutomaticPaymentMethods(
                                    PaymentIntentCreateParams.AutomaticPaymentMethods.builder()
                                            .setEnabled(true)
                                            .build()
                            )
                            .build();
            com.stripe.model.PaymentIntent paymentIntent = com.stripe.model.PaymentIntent.create(params);
            return paymentIntent.getId();
        }catch (StripeException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public List<PaymentIntent> listPaymentIntents() {
        try {
            Stripe.apiKey = this.apiKey;
            PaymentIntentListParams params =
                    PaymentIntentListParams.builder().setLimit(100L).build();
            PaymentIntentCollection paymentIntentCollection = com.stripe.model.PaymentIntent.list(params);
            List<com.stripe.model.PaymentIntent> paymentIntents =  paymentIntentCollection.getData();
            List<PaymentIntent> response = new ArrayList<>();
            for(com.stripe.model.PaymentIntent stripePaymentIntent : paymentIntents) {
                PaymentIntent paymentIntent = new PaymentIntent();
                paymentIntent.setPaymentMethodTypes(stripePaymentIntent.getPaymentMethodTypes());
                paymentIntent.setId(stripePaymentIntent.getId());
                if(stripePaymentIntent.getAutomaticPaymentMethods() != null) {
                    paymentIntent.setAreAutomaticPaymentMethodsEnabled(stripePaymentIntent.getAutomaticPaymentMethods().getEnabled());
                }
                paymentIntent.setAmount(stripePaymentIntent.getAmount());
                paymentIntent.setStatus(stripePaymentIntent.getStatus());
                response.add(paymentIntent);
            }

            return response;

        }catch (StripeException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public Boolean cancelPaymentIntent(String id) {
        try {
            Stripe.apiKey = this.apiKey;
            com.stripe.model.PaymentIntent resource = com.stripe.model.PaymentIntent.retrieve(id);
            if(!resource.getStatus().equals("canceled")) {
                PaymentIntentCancelParams params = PaymentIntentCancelParams.builder().build();
                resource.cancel(params);
            }
            return true;
        }catch (StripeException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
