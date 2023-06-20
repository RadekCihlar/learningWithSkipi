package org.example.secondExcersise.interf.impl;

import org.example.secondExcersise.interf.PaymentMethod;

public class Paypal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment processed for " + amount);
    }
}
