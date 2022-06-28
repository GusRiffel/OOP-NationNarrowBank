package com.mycompany.nationnarrowbank;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EditAccDetailsGUITest {
    
    public EditAccDetailsGUITest() {
    }


    /**
     * Test of clearAccComponents method, of class EditAccDetailsGUI.
     */
    @Test
    public void testClearAccComponents() {
        System.out.println("clearAccComponents");
        EditAccDetailsGUI instance = new EditAccDetailsGUI(new NationNarrow());
        instance.clearAccComponents();
        Component[] components = instance.getComponents();
        int expResult = 4;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
