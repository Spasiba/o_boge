package com.mybank.test;

import com.mybank.domain.*;
import com.mybank.report.CustomerReport;

public class TestBanking {
    public static void main(String[] args) {
        /*
        Account gold = new Account(500.0);
        Customer JSm = new Customer("Jane", "Smith");
        JSm.setAccount(gold);
        System.out.println("Creating the customer " + JSm.getFirstName() + " " + JSm.getLastName());
        System.out.println("Creating her account with a " + JSm.getAccount().getBalance() + " balance");
        System.out.println("Whithdraw 150.00: " + JSm.getAccount().withdraw(150.0));
        System.out.println("Deposit 22.50: " + JSm.getAccount().deposit(22.50));
        System.out.println("Whithdraw 47.62: " + JSm.getAccount().withdraw(47.62));
        System.out.println("Whithdraw 400.00: " + JSm.getAccount().withdraw(400));
        System.out.println("Customer: [" + JSm.getLastName() + ", " + JSm.getFirstName() + "] has a balance: " + JSm.getAccount().getBalance());
        System.out.println();
        */
/*
        Bank myBank = new Bank();
        SavingsAccount baseSA = new SavingsAccount(200.0, 3);
        CheckingAccount baseCA = new CheckingAccount(200, 500);
        //CheckingAccount goldCA = new CheckingAccount(500, 500);
        myBank.
        myBank.getCustomer(1).setAccount(baseCA);
        myBank.addCustomers("Owen", "Bryat");
        myBank.getCustomer(2).setAccount(baseSA);
        System.out.println("Customer [" + myBank.getCustomer(1).toString() + "] has a checking balance of " +
                            myBank.getCustomer(1).getAccount(1).getBalance() + " with a 500.00 overdraft protection.");
//        myBank.getCustomer(1).getAccount(1).withdraw(100.00);
        System.out.println("Checking Acct [" + myBank.getCustomer(1).toString() + "] : withdraw 100.00");
        System.out.println("Checking Acct [" + myBank.getCustomer(1).toString() + "] : deposit 22.50");
        System.out.println("Checking Acct [" + myBank.getCustomer(1).toString() + "] : withdraw 100.00");
        System.out.println("Checking Acct [" + myBank.getCustomer(1).toString() + "] : withdraw 100.00");*/
        CustomerReport report = new CustomerReport();

        report.generateReport();
        /*
        myBank.addCustomers("Tim", "Soley");
        myBank.getCustomer(3).setAccount(goldCA);
        myBank.addCustomers("Maria", "Soley");
        myBank.getCustomer(4).setAccount(myBank.getCustomer(3).getAccount(1));
        System.out.println("Creating the customer " + myBank.getCustomer(1));
        myBank.getCustomer(1).setAccount(baseSA);
        System.out.println("Creating her Savings Account with a " + myBank.getCustomer(1).getAccount().getBalance() +
                            " balance and 3% interest.");
        System.out.println("Creating the customer " + myBank.getCustomer(2));
        myBank.getCustomer(2).setAccount(baseCA);
        System.out.println("Creating his Checking Account with a " + myBank.getCustomer(2).getAccount().getBalance() +
                            " balance and no overdraft protection.");
        System.out.println("Creating the customer " + myBank.getCustomer(3));
        myBank.getCustomer(3).setAccount(goldCA);
        System.out.println("Creating his Checking Account with a " + myBank.getCustomer(3).getAccount().getBalance() +
                " balance and 500.0 in overdraft protection.");
        System.out.println("Creating the customer " + myBank.getCustomer(4));
        myBank.getCustomer(4).setAccount(myBank.getCustomer(3).getAccount());
        System.out.println("Maria shares her Checking Account with her husband Tim");
        System.out.println("Retrieving the customer " + myBank.getCustomer(1).toString() + " with her saving account.");
        System.out.println("Withdraw 150.00: " + myBank.getCustomer(1).getAccount().withdraw(150.00));
        System.out.println("Deposit 22.50: " + myBank.getCustomer(1).getAccount().deposit(22.50));
        System.out.println("Withdraw 47.62: " + myBank.getCustomer(1).getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00: " + myBank.getCustomer(1).getAccount().withdraw(400.00));
        System.out.println("Customer " + myBank.getCustomer(1).toString() + " has a balance of " + myBank.getCustomer(1).getAccount().getBalance());
        System.out.println("Retrieving the customer " + myBank.getCustomer(2).toString() + " with his checking account with no overdraft protection.");
        System.out.println("Withdraw 150.00: " + myBank.getCustomer(2).getAccount().withdraw(150.00));
        System.out.println("Deposit 22.50: " + myBank.getCustomer(2).getAccount().deposit(22.50));
        System.out.println("Withdraw 47.62: " + myBank.getCustomer(2).getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00: " + myBank.getCustomer(2).getAccount().withdraw(400.00));
        System.out.println("Customer " + myBank.getCustomer(2).toString() + " has a balance of " + myBank.getCustomer(2).getAccount().getBalance());
        System.out.println("Retrieving the customer " + myBank.getCustomer(3).toString() + " with his checking account with that has overdraft protection.");
        System.out.println("Withdraw 150.00: " + myBank.getCustomer(3).getAccount().withdraw(150.00));
        System.out.println("Deposit 22.50: " + myBank.getCustomer(3).getAccount().deposit(22.50));
        System.out.println("Withdraw 47.62: " + myBank.getCustomer(3).getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00: " + myBank.getCustomer(3).getAccount().withdraw(400.00));
        System.out.println("Customer " + myBank.getCustomer(3).toString() + " has a balance of " + myBank.getCustomer(3).getAccount().getBalance());
        System.out.println("Retrieving the customer " + myBank.getCustomer(4).toString() + " with her joint checking account with husband Tim.");
        System.out.println("Deposit 150.00: " + myBank.getCustomer(4).getAccount().deposit(150.00));
        System.out.println("Withdraw 750.00: " + myBank.getCustomer(4).getAccount().withdraw(750.00));
        System.out.println("Customer " + myBank.getCustomer(4).toString() + " has a balance of " + myBank.getCustomer(4).getAccount().getBalance());
        */
    }
}