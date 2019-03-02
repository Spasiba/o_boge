package com.mybank.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student1
 */
public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount myMoney = new CheckingAccount(5000, 2000);
        myMoney.withdraw(30);
        SavingsAccount yourDeposit = new SavingsAccount(7, 5000);
        yourDeposit.deposit(40);
        
        System.out.println("Баланс "+ yourDeposit.getBalance());
    }
}
