package org.example.evaluations.implementation.clients;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentIntentCollection;
import com.stripe.param.PaymentIntentCancelParams;
import com.stripe.param.PaymentIntentCreateParams;
import com.stripe.param.PaymentIntentListParams;
import org.example.evaluations.implementation.dtos.PaymentIntent_;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StripePaymentGateway_ {

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
            PaymentIntent paymentIntent = PaymentIntent.create(params);
            return paymentIntent.getId();
        }catch (StripeException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public List<PaymentIntent_> listPaymentIntents() {
        try {
            Stripe.apiKey = this.apiKey;
            PaymentIntentListParams params =
                    PaymentIntentListParams.builder().setLimit(100L).build();
            PaymentIntentCollection paymentIntentCollection = PaymentIntent.list(params);
            List<PaymentIntent> paymentIntents =  paymentIntentCollection.getData();
            List<PaymentIntent_> response = new ArrayList<>();
            for(PaymentIntent stripePaymentIntent : paymentIntents) {
                PaymentIntent_ paymentIntent = new PaymentIntent_();
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
            PaymentIntent resource = PaymentIntent.retrieve(id);
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
