package com.mycompany.nationnarrowbank;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DailyReportGUITest {
    
    public DailyReportGUITest() {
    }

    /**
     * Test of managerLoginGUI method, of class DailyReportGUI.
     */
    @Test
    public void testManagerLoginGUI() {
        System.out.println("managerLoginGUI");
        DailyReportGUI instance = new DailyReportGUI(new NationNarrow());
        instance.managerLoginGUI();
        Component[] components = instance.getComponents();
        int expResult = 8;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginCheck method, of class DailyReportGUI.
     */
    @Test
    public void testLoginCheck() {
        System.out.println("loginCheck");
        DailyReportGUI instance = new DailyReportGUI(new NationNarrow());
        boolean expResult = false;
        boolean result = instance.loginCheck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dailyReportGUI method, of class DailyReportGUI.
     */
    @Test
    public void testDailyReportGUI() {
        System.out.println("dailyReportGUI");
        DailyReportGUI instance = new DailyReportGUI(new NationNarrow());
        instance.dailyReportGUI();
        Component[] components = instance.getComponents();
        int expResult = 4;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of clearAccComponents method, of class DailyReportGUI.
     */
    @Test
    public void testClearAccComponents() {
        System.out.println("clearAccComponents");
        DailyReportGUI instance = new DailyReportGUI(new NationNarrow());
        instance.clearAccComponents();
        Component[] components = instance.getComponents();
        int expResult = 4;
        int result = components.length;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of accInstance method, of class DailyReportGUI.
     */
    @Test
    public void testAccInstance() {
        System.out.println("accInstance");
        NationNarrow bank = new NationNarrow();
        bank.createBusinessAccount("test", 1, 1, "test");
        ArrayList<Account> accountList = bank.getList();
        assertTrue(accountList.get(0) instanceof BusinessAccount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
