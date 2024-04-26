package com.paymentservice.paymentservice.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazporpayConfig {
    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        return new RazorpayClient("key_id", "key_secret");
    }
}
