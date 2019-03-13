package com.mybank.domain;

public class Account {
    protected double balance;

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) throws OverdraftExeption{
        boolean result = false;
        if(amt <= balance) {
            balance -= amt;
        }
        throw new OverdraftExeption("Insufficient funds", amt - balance);
    }

    public double getBalance() {
        return balance;
    }

    protected Account(double initBalance) {
        balance = initBalance;
    }
}