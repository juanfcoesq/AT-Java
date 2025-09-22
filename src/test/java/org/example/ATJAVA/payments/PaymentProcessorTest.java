package org.example.ATJAVA.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentProcessor paymentProcessor;
    private PaymentGateway paymentGateway;

    @Before
    public void setUp() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(paymentProcessor.makePayment(1000));

    }
    @Test
    public void payment_is_worng() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));

    }
}