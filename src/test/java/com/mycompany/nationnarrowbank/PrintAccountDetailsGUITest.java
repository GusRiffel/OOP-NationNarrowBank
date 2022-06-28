package com.mycompany.nationnarrowbank;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrintAccountDetailsGUITest {
    
    public PrintAccountDetailsGUITest() {
    }

    /**
     * Test of printAccDetailsGUI method, of class PrintAccountDetailsGUI.
     */
    @Test
    public void testPrintAccDetailsGUI() {
        System.out.println("printAccDetailsGUI");
        PrintAccountDetailsGUI instance = new PrintAccountDetailsGUI(new NationNarrow());
        instance.printAccDetailsGUI();
        Component[] components = instance.getComponents();
        int expResult = 5;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
