package com.paymentservice.paymentservice.paymentgateway;

import com.paymentservice.paymentservice.models.PaymentStatus;

public interface PaymentGateway {
    String createPaymentLink(
            Long amount,
            String username,
            String email,
            String userPhoneno,Long orderId
    );
    PaymentStatus getPaymentStatus(Long orderId);
}
