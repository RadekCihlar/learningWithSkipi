package org.example.secondExcersise.interf.impl;

import org.example.secondExcersise.interf.PaymentMethod;

public class Cash implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Cash payment processed for " + amount);
    }
}
