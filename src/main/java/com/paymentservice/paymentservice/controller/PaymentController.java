package com.paymentservice.paymentservice.controller;

import com.paymentservice.paymentservice.DTO.CreatePaymentDTO;
import com.paymentservice.paymentservice.DTO.ResponsePaymentLinkDTO;
import com.paymentservice.paymentservice.models.PaymentStatus;
import com.paymentservice.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService =paymentService;
    }
    @PostMapping()
    public ResponsePaymentLinkDTO createPaymentLink(@RequestBody  CreatePaymentDTO createPaymentDTO){
        String redirectURL = paymentService.createPaymentLink(createPaymentDTO.getOrderId());
        ResponsePaymentLinkDTO responsePaymentLinkDTO= new ResponsePaymentLinkDTO();
        responsePaymentLinkDTO.setUrl(redirectURL);
        return responsePaymentLinkDTO;


    }
    @GetMapping("/{id}")
    public PaymentStatus checkPaymentStatus(@PathVariable("id") Long paymmentId){
        return paymentService.checkPaymentStatus(paymmentId);
    }

}
