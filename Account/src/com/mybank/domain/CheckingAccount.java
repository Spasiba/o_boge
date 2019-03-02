package com.mybank.domain;

public class CheckingAccount extends Account {

    private double overdraftAmount;

    public CheckingAccount(double initBalance) {
        super(initBalance);
    }

    public CheckingAccount(double initBalance, double overdraft) {
        this(initBalance);
        overdraftAmount = overdraft;
    }

    @Override
    public boolean withdraw(double amt) {
        if (amt <= (overdraftAmount + balance)) {
            System.out.println("Можно снять " + (overdraftAmount + balance));
        } else {
            System.out.println("Нельзя снять");
        }
        return false;
    }
}
