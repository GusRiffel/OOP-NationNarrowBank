package com.mycompany.nationnarrowbank;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NationNarrowTest {
    
    public NationNarrowTest() {
    }

    /**
     * Test of createBusinessAccount method, of class NationNarrow.
     */
    @Test
    public void testCreateBusinessAccount() {
        System.out.println("createBusinessAccount");
        String address = "business";
        int telNumber = 111;
        double balance = 20.0;
        String compName = "Testing";
        NationNarrow instance = new NationNarrow();
        instance.createBusinessAccount(address, telNumber, balance, compName);
        ArrayList<Account> accountList = instance.getList();
        BusinessAccount account = (BusinessAccount)accountList.get(0);
        assertEquals(address, account.getAddress());
        assertEquals(telNumber, account.getTelNumber());
        assertEquals(balance, account.getBalance());
        assertEquals(compName, account.getCompName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createPersonalAcc method, of class NationNarrow.
     */
    @Test
    public void testCreatePersonalAcc() {
        System.out.println("createPersonalAcc");
        String address = "personal";
        int telNumber = 111;
        double balance = 20.0;
        String firstName = "firstName";
        String sureName = "sureName";
        String dateBirth = "dateBirth";
        NationNarrow instance = new NationNarrow();
        instance.createPersonalAcc(address, telNumber, balance, firstName, sureName, dateBirth);
        ArrayList<Account> accountList = instance.getList();
        PersonalAccount account = (PersonalAccount)accountList.get(0);
        assertEquals(address, account.getAddress());
        assertEquals(telNumber, account.getTelNumber());
        assertEquals(balance, account.getBalance());
        assertEquals(firstName, account.getFirstName());
        assertEquals(sureName, account.getSureName());
        assertEquals(dateBirth, account.getDateBirth());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createSavingAcc method, of class NationNarrow.
     */
    @Test
    public void testCreateSavingAcc() {
        System.out.println("createSavingAcc");
        String address = "Test";
        int telNumber = 111;
        double balance = 20.0;
        String firstName = "firstName";
        String sureName = "sureName";
        String dateBirth = "dateBirth";
        NationNarrow instance = new NationNarrow();
        instance.createSavingAcc(address, telNumber, balance, firstName, sureName, dateBirth);
        ArrayList<Account> accountList = instance.getList();
        SavingAccount account = (SavingAccount)accountList.get(0);
        assertEquals(address, account.getAddress());
        assertEquals(telNumber, account.getTelNumber());
        assertEquals(balance, account.getBalance());
        assertEquals(firstName, account.getFirstName());
        assertEquals(sureName, account.getSureName());
        assertEquals(dateBirth, account.getDateBirth());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verifyAccount method, of class NationNarrow.
     */
    @Test
    public void testVerifyAccount() {
        System.out.println("verifyAccount");
        
        NationNarrow instance = new NationNarrow();
        instance.createBusinessAccount("test", 1, 20.0, "testing");
        int accNumber = instance.getAccNumber() - 1;
        boolean expResult = true;
        boolean result = instance.verifyAccount(accNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccManage method, of class NationNarrow.
     */
    @Test
    public void testGetAccManage() {
        System.out.println("getAccManage");
        NationNarrow instance = new NationNarrow();
        instance.createBusinessAccount("test", 1, 20.0, "testing");
        instance.verifyAccount(instance.getAccNumber() - 1);
        int expResult = 1;
        int result = instance.getAccManage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccNumber method, of class NationNarrow.
     */
    @Test
    public void testGetAccNumber() {
        System.out.println("getAccNumber");
        NationNarrow instance = new NationNarrow();
        instance.createBusinessAccount("teste", 1, 20.0, "testing");
        int expResult = 1;
        int result = instance.getAccNumber() - 1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNameWithNumber method, of class NationNarrow.
     */
    @Test
    public void testGetNameWithNumber() {
        System.out.println("getNameWithNumber");
        NationNarrow instance = new NationNarrow();
        instance.createBusinessAccount("test", 1, 11, "compName");
        int number = instance.getAccNumber() - 1;
        String expResult = "compName";
        String result = instance.getNameWithNumber(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class NationNarrow.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        NationNarrow instance = new NationNarrow();
        instance.createBusinessAccount("teste", 1, 1, "testing");
        int accNumber = instance.getAccNumber() - 1;
        Account result = instance.getAccount(accNumber);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class NationNarrow.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        NationNarrow instance = new NationNarrow();
        instance.createBusinessAccount("teste", 1, 1, "testing");
        int accNumber = instance.getAccNumber() - 1;
        instance.deleteAccount(accNumber);
        ArrayList<Account> accountList = instance.getList();
        int expResult = 0;
        assertEquals(expResult, accountList.size());       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
