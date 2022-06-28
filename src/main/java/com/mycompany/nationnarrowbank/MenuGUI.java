package com.mycompany.nationnarrowbank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuGUI implements ActionListener {
    
    private static JPanel mainPanel;
    private static CardLayout cardLayout;
    
    private NationNarrow bank = new NationNarrow();
    
    private JFrame frame;
    
    private JPanel menu;
    
    private JButton createAcc;
    private JButton deleteAcc;
    private JButton manageAcc;
    private JButton dailyReport;
    
    private CreateAccGUI createAccGUI;
    private DeleteAccGUI deleteAccGUI;
    private ManageAccGUI manageAccGUI;
    private DailyReportGUI dailyReportGUI;
    private PrintAccountDetailsGUI printAccDetailsGUI;
    private EditAccDetailsGUI editAccDetailsGUI;
    private AccCreatedDetailsGUI accCreatedGUI;
    
    public MenuGUI(){
    
        frame = new JFrame();
        frame.setSize(720, 580);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NationNarrow");
        
        
        mainPanel = new JPanel(); // creating cardLayout
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        
        createAccGUI = new CreateAccGUI(bank);
        deleteAccGUI = new DeleteAccGUI(bank);
        manageAccGUI = new ManageAccGUI(bank);
        dailyReportGUI = new DailyReportGUI(bank);
        printAccDetailsGUI = new PrintAccountDetailsGUI(bank);
        editAccDetailsGUI = new EditAccDetailsGUI(bank);
        accCreatedGUI = new AccCreatedDetailsGUI(bank);
        
        menu = new JPanel();
        menu.setBackground(new Color(249 , 247, 239));
       
        
               
        createAcc = new JButton("New Account");
        createAcc.addActionListener(this);
        menu.add(createAcc);
        
        deleteAcc = new JButton("Delete Account");
        deleteAcc.addActionListener(this);
        menu.add(deleteAcc);
        
        manageAcc = new JButton("Existing Customer");
        manageAcc.addActionListener(this);
        menu.add(manageAcc);
        
        dailyReport = new JButton("Daily Report");
        dailyReport.addActionListener(this);
        menu.add(dailyReport);
        
        mainPanel.add(menu, "menu");
        mainPanel.add(createAccGUI, "createAccGUI");
        mainPanel.add(deleteAccGUI, "deleteAccGUI");
        mainPanel.add(manageAccGUI, "manageAccGUI");
        mainPanel.add(dailyReportGUI, "dailyReportGUI");
        mainPanel.add(printAccDetailsGUI, "printAccDetailsGUI");
        mainPanel.add(editAccDetailsGUI, "editAccDetailsGUI");
        mainPanel.add(accCreatedGUI, "accCreatedGUI");
        
        cardLayout.show(mainPanel, "menu");
        
        
        frame.add(mainPanel);
        frame.setVisible(true);
        
    }
    
    public static void navigator(String destination){ //function to navigate through panels
    
        cardLayout.show(mainPanel, destination);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == createAcc){
            cardLayout.show(mainPanel, "createAccGUI");
        }else if(e.getSource() == deleteAcc){
            cardLayout.show(mainPanel, "deleteAccGUI");
        }else if(e.getSource() == manageAcc){
            cardLayout.show(mainPanel, "manageAccGUI");
        }else if(e.getSource() == dailyReport){
            cardLayout.show(mainPanel, "dailyReportGUI");
        }
    }
    
}
