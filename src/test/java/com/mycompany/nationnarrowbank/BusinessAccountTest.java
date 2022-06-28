package com.mycompany.nationnarrowbank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessAccountTest {
    
    public BusinessAccountTest() {
    }

    /**
     * Test of deposit method, of class BusinessAccount.
     */
    @Test
    public void testDeposit() {
        //System.out.println("deposit");
        double money = 20.0;
        double expResult = 40.0;
        BusinessAccount instance = new BusinessAccount(1, "teste", 20, 20.0, "testing");
        instance.deposit(money);
        double result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class BusinessAccount.
     */
    @Test
    public void testWithdraw() {
        //System.out.println("withdraw");
        double money = 20.0;
        double expResult = 0.0;
        BusinessAccount instance = new BusinessAccount(1, "teste", 20, 20.0, "testing");
        instance.withdraw(money);
        double result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewBalance method, of class BusinessAccount.
     */
    @Test
    public void testViewBalance() {
        System.out.println("viewBalance");
        BusinessAccount instance = new BusinessAccount(1, "teste", 20, 20.0, "testing");
        double expResult = 20.0;
        double result = instance.viewBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of specialOffer method, of class BusinessAccount.
     */
    @Test
    public void testSpecialOffer() {
        System.out.println("specialOffer");
        double deposit = 100000.0;
        BusinessAccount instance = new BusinessAccount(1, "teste", 20, 20.0, "testing");
        boolean expResult = false;
        boolean result = instance.specialOffer(deposit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompName method, of class BusinessAccount.
     */
    @Test
    public void testGetCompName() {
        System.out.println("getCompName");
        BusinessAccount instance = new BusinessAccount(1, "teste", 20, 20.0, "testing");
        String expResult = "testing";
        String result = instance.getCompName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCompName method, of class BusinessAccount.
     */
    @Test
    public void testSetCompName() {
        System.out.println("setCompName");
        String cName = "setName";
        String expResult = "setName";
        BusinessAccount instance = new BusinessAccount(1, "teste", 20, 20.0, "testing");
        instance.setCompName(cName);
        String result = instance.getCompName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
