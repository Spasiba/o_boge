/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student1
 */
public class Customer {

    private static int baseNumber = 1000;

    private String firstName;
    private String lastName;
    private int custNumber;

    private int numberOfAccounts;
    private int currentAccountNumber = 0;
    private List<Account> accounts;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
// initialize accounts attribute
        accounts = new ArrayList<Account>(10);
    }

    public void setAccount(Account acct) {
        accounts.add(acct);
    }
    
public Account getAccount(int account_index){
    return accounts.get(account_index);
}

    @Override
    public String toString() {
        return "\n" + firstName + " " + lastName + "\n===\n номер клиента: " + custNumber + "\n количество счетов: " + numberOfAccounts;
    }

    String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public int getNumOfAccounts() {
return accounts.size();
}

}
