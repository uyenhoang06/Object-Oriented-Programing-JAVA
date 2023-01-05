package com.patterns.strategy.strategies;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    public CreditCard(String number, String date, String cardVerificationValue) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }

    public int getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
