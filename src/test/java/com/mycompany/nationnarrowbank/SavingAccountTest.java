package com.mycompany.nationnarrowbank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavingAccountTest {
    
    public SavingAccountTest() {
    }

    /**
     * Test of deposit method, of class SavingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double money = 20.0;
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        instance.deposit(money);
        double expResult = 40.0;
        double result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class SavingAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double money = 10.0;
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        instance.withdraw(money);
        double expResult = 10.0;
        double result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewBalance method, of class SavingAccount.
     */
    @Test
    public void testViewBalance() {
        System.out.println("viewBalance");
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        double expResult = 20.0;
        double result = instance.viewBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class SavingAccount.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        String expResult = "firstName";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSureName method, of class SavingAccount.
     */
    @Test
    public void testGetSureName() {
        System.out.println("getSureName");
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        String expResult = "sureName";
        String result = instance.getSureName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDateBirth method, of class SavingAccount.
     */
    @Test
    public void testGetDateBirth() {
        System.out.println("getDateBirth");
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        String expResult = "dBirth";
        String result = instance.getDateBirth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class SavingAccount.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String fName = "newFirstName";
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        instance.setFirstName(fName);
        String expResult = "newFirstName";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSureName method, of class SavingAccount.
     */
    @Test
    public void testSetSureName() {
        System.out.println("setSureName");
        String sName = "newSureName";
        SavingAccount instance = new SavingAccount(1, "address", 111, 20.0, "firstName", "sureName", "dBirth");
        instance.setSureName(sName);
        String expResult = "newSureName";
        String result = instance.getSureName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
