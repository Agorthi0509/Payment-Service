package com.paymentservice.paymentservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment extends BaseModel {
    private Long amount;
    private Long userId;
    private  Long orderId;
    private PaymentStatus paymentStatus;
    private String paymentLink;
    private Long paymentRefId;
    private PaymentGateway paymentGateway;

}
