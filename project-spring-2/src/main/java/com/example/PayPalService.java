package com.example;

import org.springframework.stereotype.Component;

@Component
public class PayPalService implements PaymentService{
    @Override
    public void paymentMethod(String product) {
        System.out.println("Paid with PayPal for " + product);
    }
}
