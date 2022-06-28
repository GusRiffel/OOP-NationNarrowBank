package com.mycompany.nationnarrowbank;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeleteAccGUITest {
    
    public DeleteAccGUITest() {
    }

    /**
     * Test of deleteAccGui method, of class DeleteAccGUI.
     */
    @Test
    public void testDeleteAccGui() {
        System.out.println("deleteAccGui");
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

    /**
     * Test of deleteConfirm method, of class DeleteAccGUI.
     */
    @Test
    public void testDeleteConfirm() {
        System.out.println("deleteConfirm");
        NationNarrow instance = new NationNarrow();
        ArrayList<Account> accountList = instance.getList();
        
        instance.createBusinessAccount("teste", 1, 1, "testing");
        BusinessAccount account = (BusinessAccount)accountList.get(0);
        int accNumber = instance.getAccNumber() - 1;
        String accName = account.getCompName();
        instance.deleteAccount(accNumber);
        int accountdeleted = accountList.size();
        assertEquals("testing", accName);
        assertEquals(0 , accountdeleted);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
