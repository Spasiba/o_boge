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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author student1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mybank.domain.DataSourceTest.class, com.mybank.domain.CustomerTest.class, com.mybank.domain.CheckingAccountTest.class, com.mybank.domain.AccountTestTest.class, com.mybank.domain.SavingsAccountTest.class, com.mybank.domain.CustomerReportTest.class, com.mybank.domain.AccountTest.class, com.mybank.domain.BankTest.class, com.mybank.domain.TestReportTest.class})
public class DomainSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
