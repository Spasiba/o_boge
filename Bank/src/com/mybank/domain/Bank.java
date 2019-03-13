package com.mybank.domain;

public class Bank {
    private static Customer[] customers;
    private static int numberOfCustomers;

    public Bank(){}

    static  {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public static void addCustomer(String f, String l) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l);
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public static Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }

}