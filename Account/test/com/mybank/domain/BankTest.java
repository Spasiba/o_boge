/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student1
 */
public class BankTest {
    
    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String f = "";
        String l = "";
        Bank.addCustomer(f, l);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumOfCustomers method, of class Bank.
     */
    @Test
    public void testGetNumOfCustomers() {
        System.out.println("getNumOfCustomers");
        int expResult = 0;
        int result = Bank.getNumOfCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int customer_index = 0;
        Customer expResult = null;
        Customer result = Bank.getCustomer(customer_index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
