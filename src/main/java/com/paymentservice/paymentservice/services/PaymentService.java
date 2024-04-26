package com.paymentservice.paymentservice.services;

import com.paymentservice.paymentservice.models.PaymentStatus;
import com.paymentservice.paymentservice.paymentgateway.PaymentGateway;
import com.paymentservice.paymentservice.paymentgateway.PaymentGatewayFactory;
import com.paymentservice.paymentservice.paymentgateway.RazorpayPaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    public String createPaymentLink(Long orderId) {

        //get order details
        //gateway create link
        Long amount=1000L;
        String username= "Aditya";
        String email ="abc.com";
        String  phoneNo="123456";
        PaymentGateway paymentGateway = PaymentGatewayFactory.createPaymentGateway();
        return paymentGateway.createPaymentLink(amount,username,email,phoneNo,orderId);
    }


    public PaymentStatus checkPaymentStatus(Long paymentId) {
        return null;
    }
}


