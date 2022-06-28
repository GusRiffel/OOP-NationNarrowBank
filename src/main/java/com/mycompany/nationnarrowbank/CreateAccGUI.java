package com.mycompany.nationnarrowbank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreateAccGUI extends JPanel implements ActionListener{
   
    private NationNarrow bank;
    private JButton businessAccGUI;
    private JButton personalAccGUI;
    private JButton savingAccGUI;
    private JButton menu;
    private JLabel text;
    private JLabel compName;
    private JLabel address;
    private JLabel telNumber;
    private JLabel initialBalance;
    private JLabel firstName;
    private JLabel sureName;
    private JLabel dateBirth;
    private JTextField firstNameText;
    private JTextField sureNameText;
    private JTextField dateBirthText;
    private JTextField compNameText;
    private JTextField addressText; 
    private JTextField telNumberText;
    private JTextField initialBalanceText;
    private JButton createBusiness;
    private JButton createAccount;
    private String accSelected = " ";
               
    public CreateAccGUI(NationNarrow bank){
        
        this.bank = bank;

        text = new JLabel("Which type o Account are you Looking for ?");
        add(text);

        businessAccGUI = new JButton("Business");
        businessAccGUI.addActionListener(this);
        add(businessAccGUI);

        personalAccGUI = new JButton("Personal");
        personalAccGUI.addActionListener(this);
        add(personalAccGUI);

        savingAccGUI = new JButton("Saving");
        savingAccGUI.addActionListener(this);
        add(savingAccGUI);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
    
    }
    
    public void createAccGUI(){
    
        this.removeAll();
        text = new JLabel("Which type o Account are you Looking for ?");
        add(text);

        businessAccGUI = new JButton("Business");
        businessAccGUI.addActionListener(this);
        add(businessAccGUI);

        personalAccGUI = new JButton("Personal");
        personalAccGUI.addActionListener(this);
        add(personalAccGUI);

        savingAccGUI = new JButton("Saving");
        savingAccGUI.addActionListener(this);
        add(savingAccGUI);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        this.revalidate();
        this.repaint();
    }
    
    public void createBusinessAccGUI(){
    
        this.removeAll();
        //this.setLayout(new FlowLayout(FlowLayout.TRAILING));
        compName = new JLabel("Company Name");
        add(compName);
         
        compNameText = new JTextField(20);
        add(compNameText);
         
        address = new JLabel("Address");
        add(address);
         
        addressText = new JTextField(20);
        add(addressText);
         
        telNumber = new JLabel("Telephone Number");
        add(telNumber);
         
        telNumberText = new JTextField(20);
        add(telNumberText);
         
        initialBalance = new JLabel("Inital Balance");
        add(initialBalance);
         
        initialBalanceText = new JTextField(20);
        add(initialBalanceText);
         
        createBusiness = new JButton("Create Account");
        createBusiness.addActionListener(this);
        add(createBusiness);
        this.revalidate();
        this.repaint();
    }
    
    public void createBusinessAccount(){

        String getCompName = compNameText.getText();
        String getAddress = addressText.getText();
        int getTelNumber = Integer.parseInt(telNumberText.getText());
        double initBalance = Double.parseDouble(initialBalanceText.getText());
        
        bank.createBusinessAccount(getAddress, getTelNumber, initBalance, getCompName);
    }
    
    public void createPersonalAndSavingAccGUI(){
    
        this.removeAll();
        firstName = new JLabel("First Name");
        add(firstName);
        
        firstNameText = new JTextField(20);
        add(firstNameText);
        
        sureName = new JLabel("Sure Name");
        add(sureName);
        
        sureNameText = new JTextField(20);
        add(sureNameText);
        
        dateBirth = new JLabel("Date of Birth");
        add(dateBirth);
        
        dateBirthText = new JTextField(20);
        add(dateBirthText);
        
        address = new JLabel("address");
        add(address);
        
        addressText = new JTextField(20);
        add(addressText);
        
        telNumber = new JLabel("Telephone Number");
        add(telNumber);
        
        telNumberText = new JTextField(20);
        add(telNumberText);
        
        initialBalance = new JLabel("Initial Balance");
        add(initialBalance);
        
        initialBalanceText = new JTextField(20);
        add(initialBalanceText);
        
        createAccount = new JButton("Create");
        createAccount.addActionListener(this);
        add(createAccount);
        
        this.revalidate();
        this.repaint();
    }
    
    public void createPersonalAccount(){
    
        String getAddress = addressText.getText();
        int getTelNumber = Integer.parseInt(telNumberText.getText());
        double getBalance = Double.parseDouble(initialBalanceText.getText());
        String getFirstName = firstNameText.getText();
        String getSureName = sureNameText.getText();
        String getDateBirth = dateBirthText.getText();
        
        bank.createPersonalAcc(getAddress, getTelNumber, getBalance, getFirstName, getSureName, getDateBirth);
    }
    
    public void createSavingAccount(){
        
        String getAddress = addressText.getText();
        int getTelNumber = Integer.parseInt(telNumberText.getText());
        double getBalance = Double.parseDouble(initialBalanceText.getText());
        String getFirstName = firstNameText.getText();
        String getSureName = sureNameText.getText();
        String getDateBirth = dateBirthText.getText();
        
        bank.createSavingAcc(getAddress, getTelNumber, getBalance, getFirstName, getSureName, getDateBirth);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          
        if(e.getSource() == businessAccGUI){
            createBusinessAccGUI();
        }else if(e.getSource() == personalAccGUI){
            accSelected = "Personal";
            createPersonalAndSavingAccGUI();
        }else if(e.getSource() == savingAccGUI){
            accSelected = "Saving";
            createPersonalAndSavingAccGUI();
        }else if(e.getSource() == createBusiness){
            createBusinessAccount();
            createAccGUI();
            MenuGUI.navigator("accCreatedGUI");
            JOptionPane.showMessageDialog(this, "Business account created!");
        }else if(e.getSource() == createAccount){
            if(accSelected.equalsIgnoreCase("Personal")){
                createPersonalAccount();
                createAccGUI();
                MenuGUI.navigator("accCreatedGUI");
                JOptionPane.showMessageDialog(this, "Personal account created!");
            }else if(accSelected.equalsIgnoreCase("Saving")){
                createSavingAccount();
                createAccGUI();
                MenuGUI.navigator("accCreatedGUI");
                JOptionPane.showMessageDialog(this, "Saving account created!");
            }
        }else if(e.getSource() == menu){
            MenuGUI.navigator("menu");
        }
    }
}
