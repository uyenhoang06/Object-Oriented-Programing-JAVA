package com.patterns.strategy.strategies;

public class MyPayStrategy {
    private static MyPayStrategy instance;
    private PayStrategy payStrategy;

    private MyPayStrategy() {

    }

    public static MyPayStrategy getInstance() {
        if (instance == null) {
            instance = new MyPayStrategy();
        }
        return instance;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }

    public boolean pay(int paymentAmount) {
        return payStrategy.pay(paymentAmount);
    }

    public void collectPaymentDetails() {
        payStrategy.collectPaymentDetails();
    }
}
