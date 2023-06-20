package org.example.secondExcersise.interf.impl;

import org.example.secondExcersise.interf.PaymentMethod;

public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processed for " + amount);
    }
}
