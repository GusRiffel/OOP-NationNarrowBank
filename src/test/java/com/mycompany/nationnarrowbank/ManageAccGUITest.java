package com.mycompany.nationnarrowbank;

import java.awt.Component;
import java.awt.event.ActionEvent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManageAccGUITest {
    
    public ManageAccGUITest() {
    }

    /**
     * Test of verifyGUI method, of class ManageAccGUI.
     */
    @Test
    public void testVerifyGUI() {
        System.out.println("verifyGUI");
        ManageAccGUI instance = new ManageAccGUI(new NationNarrow());
        instance.verifyGUI();
        Component[] components = instance.getComponents();
        int expResult = 5;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of depositGUI method, of class ManageAccGUI.
     */
    @Test
    public void testDepositGUI() {
        System.out.println("depositGUI");
        ManageAccGUI instance = new ManageAccGUI(new NationNarrow());
        instance.depositGUI();
        Component[] components = instance.getComponents();
        int expResult = 4;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of withDrawGUI method, of class ManageAccGUI.
     */
    @Test
    public void testWithDrawGUI() {
        System.out.println("withDrawGUI");
        ManageAccGUI instance = new ManageAccGUI(new NationNarrow());
        instance.withDrawGUI();
        Component[] components = instance.getComponents();
        int expResult = 4;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of manageAccGUI method, of class ManageAccGUI.
     */
    @Test
    public void testManageAccGUI() {
        System.out.println("manageAccGUI");
        ManageAccGUI instance = new ManageAccGUI(new NationNarrow());
        instance.manageAccGUI();
        Component[] components = instance.getComponents();
        int expResult = 5;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
