package com.mybank.domain;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double interestRate, double initBalance) {
        super(initBalance);
        this.interestRate = interestRate;
    }
}
