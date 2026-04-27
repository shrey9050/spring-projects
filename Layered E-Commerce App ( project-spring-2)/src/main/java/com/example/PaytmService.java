package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PaytmService implements PaymentService{
    @Override
    public void paymentMethod(String product) {
        System.out.println("Paid with Paytm for " + product);
    }
}
