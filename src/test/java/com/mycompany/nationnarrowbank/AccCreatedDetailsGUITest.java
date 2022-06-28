package com.mycompany.nationnarrowbank;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccCreatedDetailsGUITest {
    
    public AccCreatedDetailsGUITest() {
    }

    /**
     * Test of accCreatedDetails method, of class AccCreatedDetailsGUI.
     */
    @Test
    public void testAccCreatedDetails() {
        System.out.println("accCreatedDetails");
        AccCreatedDetailsGUI instance = new AccCreatedDetailsGUI(new NationNarrow());
        instance.accCreatedDetails();
        Component[] components = instance.getComponents();
        int expResult = 3;
        int result = components.length;
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of accInstance method, of class AccCreatedDetailsGUI.
     */
    @Test
    public void testAccInstance() {
        System.out.println("accInstance");
        NationNarrow bank = new NationNarrow();
        bank.createBusinessAccount("test", 1, 1, "test");
        ArrayList<Account> accountList = bank.getList();
        assertTrue(accountList.get(0) instanceof BusinessAccount);
        //instance.accInstance(accountList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
