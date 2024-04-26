package com.paymentservice.paymentservice.paymentgateway;

public class PaymentGatewayFactory {
    public static PaymentGateway createPaymentGateway(){
        return new RazorpayPaymentGateway();
    }
}
