package com.paymentservice.paymentservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook/stripe")
public class StripeController {
    public void handleWebHookEvent(){

    }
}
