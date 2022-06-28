package com.mycompany.nationnarrowbank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class DailyReportGUI extends JPanel implements ActionListener {

    private NationNarrow bank;
    private JButton showReport;
    private JLabel report;
    private JButton accDetails;
    private JButton menu;
    
    private JLabel accNumber;
    private JTextField accNumberText;
    private JLabel accType;
    private JTextField accTypeText;
    private JLabel compName;
    private JLabel firstName;
    private JTextField firstNameText;
    private JLabel sureName;
    private JTextField sureNameText;
    private JTextField compNameText;
    private JLabel balance;
    private JTextField balanceText;
    private JLabel username;
    private JTextField usernameText;
    private JLabel password;
    private JPasswordField passwordText;
    private JButton login;
    private JLabel message;
    
    public DailyReportGUI(NationNarrow bank){
    
        this.bank = bank;
        
        username = new JLabel("Username");
        add(username);
        
        usernameText = new JTextField(20);
        add(usernameText);
        
        password = new JLabel("Password");
        add(password);
        
        passwordText = new JPasswordField(20);
        add(passwordText);
        
        login = new JButton("Login");
        login.addActionListener(this);
        add(login);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        
        message = new JLabel("For the sake of the example user Username: Manager and Password: Manager");
        add(message);
    }
    
    public void managerLoginGUI(){
        
        this.removeAll();
        report = new JLabel();
        add(report);
        
        username = new JLabel("Username");
        add(username);
        
        usernameText = new JTextField(20);
        add(usernameText);
        
        password = new JLabel("Password");
        add(password);
        
        passwordText = new JPasswordField(20);
        add(passwordText);
        
        login = new JButton("Login");
        login.addActionListener(this);
        add(login);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        
        message = new JLabel("For the sake of the example user Username: Manager and Password: Manager");
        add(message);
        
        this.revalidate();
        this.repaint();
    }
    
    public boolean loginCheck(){
    
        String savedPassword = "Manager";
        String savedUserName = "Manager";
        String typedUserName = usernameText.getText();
        String typedPassword = String.valueOf(passwordText.getPassword());
        
        report = new JLabel();
        add(report);
        
        if(savedPassword.equals(typedPassword) && savedUserName.equals(typedUserName)){
            return true;
        }else{
            return false;
        }
    }
    
    public void dailyReportGUI(){
        
        this.removeAll();
        report = new JLabel();
        add(report);
        
        showReport = new JButton("Show Report");
        showReport.addActionListener(this);
        add(showReport);
        
        accDetails = new JButton("Account Details");
        accDetails.addActionListener(this);
        add(accDetails);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        this.revalidate();
        this.repaint();
    }
    
    private void printBusinessAccount(BusinessAccount businessAcc) {
        
        
        accNumber = new JLabel("Account Number:");
        this.add(accNumber);
        
        accNumberText = new JTextField(20);
        accNumberText.setText(String.valueOf(businessAcc.getAccNumber()));
        accNumberText.setEditable(false);
        add(accNumberText);
        
        accType = new JLabel("Account Type:");
        this.add(accType);
        
        accTypeText = new JTextField(20);
        accTypeText.setText("Business Account");
        accTypeText.setEditable(false);
        add(accTypeText);
        
        compName = new JLabel("Company Name:");
        this.add(compName);
        
        compNameText = new JTextField(20);
        compNameText.setText(String.valueOf(businessAcc.getCompName()));
        compNameText.setEditable(false);
        add(compNameText);
        
        balance = new JLabel("Balance: £");
        this.add(balance);
        
        balanceText = new JTextField(20);
        balanceText.setText(String.valueOf(businessAcc.getBalance()));
        balanceText.setEditable(false);
        add(balanceText); 
        
    }
    
    private void printPersonalAccount(PersonalAccount personalAcc) {
        
        
        accNumber = new JLabel("Account Number:");
        this.add(accNumber);
        
        accNumberText = new JTextField(20);
        accNumberText.setText(String.valueOf(personalAcc.getAccNumber()));
        accNumberText.setEditable(false);
        add(accNumberText);
        
        accType = new JLabel("Account Type:");
        this.add(accType);
        
        accNumberText = new JTextField(20);
        accNumberText.setText("Personal Account");
        accNumberText.setEditable(false);
        add(accNumberText);
        
        firstName = new JLabel("First Name:");
        this.add(firstName);
        
        firstNameText = new JTextField(20);
        firstNameText.setText(String.valueOf(personalAcc.getFirstName()));
        firstNameText.setEditable(false);
        add(firstNameText);
        
        sureName = new JLabel("Sure Name:");
        this.add(sureName);
        
        sureNameText = new JTextField(20);
        sureNameText.setText(String.valueOf(personalAcc.getSureName()));
        sureNameText.setEditable(false);
        add(sureNameText);
        
        balance = new JLabel("Balance: £");
        this.add(balance);
        
        balanceText = new JTextField(20);
        balanceText.setText(String.valueOf(personalAcc.getBalance()));
        balanceText.setEditable(false);
        add(balanceText);     
    }
    
    private void printSavingAccount(SavingAccount savingAcc) {
        
        
        accNumber = new JLabel("Account Number:");
        this.add(accNumber);
        
        accNumberText = new JTextField(20);
        accNumberText.setText(String.valueOf(savingAcc.getAccNumber()));
        accNumberText.setEditable(false);
        add(accNumberText);
        
        accType = new JLabel("Account Type:");
        this.add(accType);
        
        accNumberText = new JTextField(20);
        accNumberText.setText("Saving Account");
        accNumberText.setEditable(false);
        add(accNumberText);
        
        firstName = new JLabel("First Name:");
        this.add(firstName);
        
        firstNameText = new JTextField(20);
        firstNameText.setText(String.valueOf(savingAcc.getFirstName()));
        firstNameText.setEditable(false);
        add(firstNameText);
        
        sureName = new JLabel("Sure Name:");
        this.add(sureName);
        
        sureNameText = new JTextField(20);
        sureNameText.setText(String.valueOf(savingAcc.getSureName()));
        sureNameText.setEditable(false);
        add(sureNameText);
        
        balance = new JLabel("Balance: £");
        this.add(balance);
        
        balanceText = new JTextField(20);
        balanceText.setText(String.valueOf(savingAcc.getBalance()));
        balanceText.setEditable(false);
        add(balanceText);        
    }
    
    public void clearAccComponents(){
   
        this.removeAll();
        report = new JLabel();
        add(report);
        
        showReport = new JButton("Show Report");
        showReport.addActionListener(this);
        add(showReport);
        
        accDetails = new JButton("Account Details");
        accDetails.addActionListener(this);
        add(accDetails);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        this.revalidate();
        this.repaint();
    }
    
    public void accInstance(ArrayList accountList){
    
        for(int i = 0; i < accountList.size(); i++){
            
                if(accountList.get(i) instanceof BusinessAccount){
                
                    BusinessAccount businessAcc = (BusinessAccount)accountList.get(i);
                    printBusinessAccount(businessAcc);
                    
                }else if(accountList.get(i) instanceof PersonalAccount){
                   
                    PersonalAccount personalAccount = (PersonalAccount)accountList.get(i);
                    printPersonalAccount(personalAccount);
                
                }else if(accountList.get(i) instanceof SavingAccount){
                
                    SavingAccount savingAccount = (SavingAccount)accountList.get(i);
                    printSavingAccount(savingAccount);
                }
            }
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        ArrayList<Account> accountList = bank.getList();
        
        if(e.getSource() == showReport){
            report.setText(" ");
            accInstance(accountList);
            
        }else if(e.getSource() == accDetails){
            clearAccComponents();
            MenuGUI.navigator("printAccDetailsGUI");
        }else if(e.getSource() == login){
            if(loginCheck() == true){
                dailyReportGUI();
            }else{
                JOptionPane.showMessageDialog(this, "Wrong username or password!");
                managerLoginGUI();
            }
        }else if(e.getSource() == menu){
            managerLoginGUI();
            MenuGUI.navigator("menu");
        }
    }


    
}
