package com.mycompany.nationnarrowbank;

import java.awt.Component;
import java.awt.event.ActionEvent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreateAccGUITest {
    
    public CreateAccGUITest() {
    }

    /**
     * Test of createAccGUI method, of class CreateAccGUI.
     */
    @Test
    public void testCreateAccGUI() {
        System.out.println("createAccGUI");
        CreateAccGUI instance = new CreateAccGUI(new NationNarrow());
        instance.createAccGUI();
        Component[] components = instance.getComponents();
        int expResult = 5;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createBusinessAccGUI method, of class CreateAccGUI.
     */
    @Test
    public void testCreateBusinessAccGUI() {
        System.out.println("createBusinessAccGUI");
        CreateAccGUI instance = new CreateAccGUI(new NationNarrow());
        instance.createBusinessAccGUI();
        Component[] components = instance.getComponents();
        int expResult = 9;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of createPersonalAndSavingAccGUI method, of class CreateAccGUI.
     */
    @Test
    public void testCreatePersonalAndSavingAccGUI() {
        System.out.println("createPersonalAndSavingAccGUI");
        CreateAccGUI instance = new CreateAccGUI(new NationNarrow());
        instance.createPersonalAndSavingAccGUI();
        Component[] components = instance.getComponents();
        int expResult = 13;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    
}
