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
public class Bank {

    private static List<Customer> customers;
    private static int numberOfCustomers;

    static {
        customers = new ArrayList<Customer>(10);
        numberOfCustomers = 0;
    }

    public Bank(Customer[] customers, int numberOfCustomers) {
        customers = customers;
        numberOfCustomers = numberOfCustomers;

    }

    public static void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    public static int getNumOfCustomers() {
        return customers.size();
    }

    public static Customer getCustomer(int customer_index) {
        return customers.get(customer_index);
    }
}
