package org.example.evaluations.implementation.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig_ {

    @Value("${razorpay.id}")
    private String razorpayKeyId;

    @Value("${razorpay.secret}")
    private String razorpayKeySecret;

//   Don't delete
//    @Bean
//    public RazorpayClient getRazorpayClient() throws RazorpayException {
//        return new RazorpayClient(razorpayKeyId,razorpayKeySecret);
//    }
}
