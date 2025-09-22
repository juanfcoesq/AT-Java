package org.example.ATJAVA.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
