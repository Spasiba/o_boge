package com.mybank.domain;

public class Account {

    protected double balance;

    protected Account(double initBalance) {
        this.balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    }

    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance = balance - amt;
            return true;
        } else {
            return false;
        }
    }
}
