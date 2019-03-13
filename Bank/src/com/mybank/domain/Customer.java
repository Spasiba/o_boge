package com.mybank.domain;

public class Customer {
    private static int baseNum = 5555;

    private String firstName;
    private String lastName;
    private Account account;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
        accounts = new Account[10];
        numberOfAccounts = 0;
    }

    public void addAccount(Account acct) {
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public Account getAccount(int account_index) {
        return accounts[account_index];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setAccount(Account acct) {
        account = acct;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}