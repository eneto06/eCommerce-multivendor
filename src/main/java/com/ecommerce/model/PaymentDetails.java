package com.ecommerce.model;

import com.ecommerce.domain.PaymentStatus;

import lombok.Data;

@Data
public class PaymentDetails {

    private String paymentId;
    private String razorPayPaymentLinkId;
    private String razorPayPaymentLinkReferenceId;
    private String razorPayPaymentLinkStatus;
    private String razorPayPaymentIdZWSP;
    private PaymentStatus status;
}
