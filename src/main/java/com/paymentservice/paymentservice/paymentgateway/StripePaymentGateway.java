package com.paymentservice.paymentservice.paymentgateway;

import com.paymentservice.paymentservice.models.PaymentStatus;

public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String createPaymentLink(Long amount, String username, String email, String userPhoneno,Long orderId) {
        return null;
    }

    @Override
    public PaymentStatus getPaymentStatus(Long orderId) {
        return null;
    }
}
