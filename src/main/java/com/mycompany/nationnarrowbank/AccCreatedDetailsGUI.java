package com.mycompany.nationnarrowbank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class AccCreatedDetailsGUI extends JPanel implements ActionListener {

    
    private NationNarrow bank;
    private JButton showDetailsButton;
    private JButton menu;
    private JLabel report;
    
    private JLabel accNumber;
    private JLabel accType;
    private JLabel firstName;
    private JLabel sureName;
    private JLabel dateBirth;
    private JLabel compName;
    private JLabel intRate;
    private JLabel address;
    private JLabel telNum;
    private JLabel balance;
    
    private JTextField accNumberTexxt;
    private JTextField accTypeText;
    private JTextField firstNameText;
    private JTextField sureNameText;
    private JTextField dateBirthText;
    private JTextField compNameText;
    private JTextField initRateText;
    private JTextField addressText;
    private JTextField telNumText;
    private JTextField balanceText;
    
    
    public AccCreatedDetailsGUI(NationNarrow bank){ // screen confirming the account creating and having the button to print the acc details
        
        this.bank = bank;
    
        report = new JLabel();
        add(report);
        
        showDetailsButton = new JButton("Show my account Details");
        showDetailsButton.addActionListener(this);
        add(showDetailsButton);
    }
    
    public void accCreatedDetails(){ // thats the acc confirmation now in a method so we can reset the information
    
        this.removeAll();
        report = new JLabel();
        add(report);
        
        showDetailsButton = new JButton("Show my account Details");
        showDetailsButton.addActionListener(this);
        add(showDetailsButton);
        this.revalidate();
        this.repaint();
    
    }
    
    private void printBusinessAccountDetails(BusinessAccount businessAcc){ // showing the acc info on the screen after checking which acc type is it and receiving by parameter
    
        this.removeAll();
        accNumber = new JLabel("Account Number:");
        this.add(accNumber);
        
        accNumberTexxt = new JTextField(20);
        accNumberTexxt.setText(String.valueOf(businessAcc.getAccNumber()));
        accNumberTexxt.setEditable(false);
        add(accNumberTexxt);
        
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
        
        intRate = new JLabel("Interest Rate: ");
        this.add(intRate);
        
        initRateText = new JTextField(20);
        initRateText.setText(String.valueOf(businessAcc.getIntRate()));
        initRateText.setEditable(false);
        add(initRateText);
        
        address = new JLabel("Address:");
        this.add(address);
        
        addressText = new JTextField(20);
        addressText.setText(String.valueOf(businessAcc.getAddress()));
        addressText.setEditable(false);
        add(addressText);
        
        telNum = new JLabel("Telephone Number:");
        this.add(telNum);
        
        telNumText = new JTextField(20);
        telNumText.setText(String.valueOf(businessAcc.getTelNumber()));
        telNumText.setEditable(false);
        add(telNumText);
        
        balance = new JLabel("Balance: £");
        this.add(balance);
        
        balanceText = new JTextField(20);
        balanceText.setText(String.valueOf(businessAcc.getBalance()));
        balanceText.setEditable(false);
        add(balanceText);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        this.revalidate();
        this.repaint();
       
    }
    
    private void printPersonalAccountDetails(PersonalAccount personalAcc) {
        
        this.removeAll();
        accNumber = new JLabel("Account Number:");
        this.add(accNumber);
        
        accNumberTexxt = new JTextField(20);
        accNumberTexxt.setText(String.valueOf(personalAcc.getAccNumber()));
        accNumberTexxt.setEditable(false);
        add(accNumberTexxt);
        
        accType = new JLabel("Account Type:");
        this.add(accType);
        
        accTypeText = new JTextField(20);
        accTypeText.setText("Personal Account");
        accTypeText.setEditable(false);
        add(accTypeText);
        
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
        
        dateBirth = new JLabel("Date of Birth:");
        this.add(dateBirth);
        
        dateBirthText = new JTextField(20);
        dateBirthText.setText(String.valueOf(personalAcc.getDateBirth()));
        dateBirthText.setEditable(false);
        add(dateBirthText);
        
        intRate = new JLabel("Interest Rate: ");
        this.add(intRate);
        
        initRateText = new JTextField(20);
        initRateText.setText(String.valueOf(personalAcc.getIntRate()));
        initRateText.setEditable(false);
        add(initRateText);
        
        address = new JLabel("Address:");
        this.add(address);
        
        addressText = new JTextField(20);
        addressText.setText(String.valueOf(personalAcc.getAddress()));
        addressText.setEditable(false);
        add(addressText);
        
        telNum = new JLabel("Telephone Number:");
        this.add(telNum);
        
        telNumText = new JTextField(20);
        telNumText.setText(String.valueOf(personalAcc.getTelNumber()));
        telNumText.setEditable(false);
        add(telNumText);
        
        balance = new JLabel("Balance: £");
        this.add(balance);
        
        balanceText = new JTextField(20);
        balanceText.setText(String.valueOf(personalAcc.getBalance()));
        balanceText.setEditable(false);
        add(balanceText);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        this.revalidate();
        this.repaint();
        
    }
    
    private void printSavingAccountDetails(SavingAccount savingAcc) {
        
        this.removeAll();
        accNumber = new JLabel("Account Number:");
        this.add(accNumber);
        
        accNumberTexxt = new JTextField(20);
        accNumberTexxt.setText(String.valueOf(savingAcc.getAccNumber()));
        accNumberTexxt.setEditable(false);
        add(accNumberTexxt);
        
        accType = new JLabel("Account Type:");
        this.add(accType);
        
        accTypeText = new JTextField(20);
        accTypeText.setText("Saving Account");
        accTypeText.setEditable(false);
        add(accTypeText);
        
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
        
        dateBirth = new JLabel("Date of Birth:");
        this.add(dateBirth);
        
        dateBirthText = new JTextField(20);
        dateBirthText.setText(String.valueOf(savingAcc.getDateBirth()));
        dateBirthText.setEditable(false);
        add(dateBirthText);
        
        intRate = new JLabel("Interest Rate: ");
        this.add(intRate);
        
        initRateText = new JTextField(20);
        initRateText.setText(String.valueOf(savingAcc.getIntRate()));
        initRateText.setEditable(false);
        add(initRateText);
        
        address = new JLabel("Address:");
        this.add(address);
        
        addressText = new JTextField(20);
        addressText.setText(String.valueOf(savingAcc.getAddress()));
        addressText.setEditable(false);
        add(addressText);
        
        telNum = new JLabel("Telephone Number:");
        this.add(telNum);
        
        telNumText = new JTextField(20);
        telNumText.setText(String.valueOf(savingAcc.getTelNumber()));
        telNumText.setEditable(false);
        add(telNumText);
        
        balance = new JLabel("Balance: £");
        this.add(balance);
        
        balanceText = new JTextField(20);
        balanceText.setText(String.valueOf(savingAcc.getBalance()));
        balanceText.setEditable(false);
        add(balanceText);
        
        menu = new JButton("Menu");
        menu.addActionListener(this);
        add(menu);
        this.revalidate();
        this.repaint();
    }
    
    public void accInstance(ArrayList<Account> accountList){ // running through the Arraylist til find the acc with the same number as provided and checking the instance of that
    
        
        int accNumberCreated = bank.getAccNumber() - 1;
                for(int i = 0; i < accountList.size(); i++){
            
                    if(accountList.get(i).getAccNumber() == accNumberCreated){    
                        if(accountList.get(i) instanceof BusinessAccount){

                            BusinessAccount businessAcc = (BusinessAccount)accountList.get(i);
                            printBusinessAccountDetails(businessAcc);

                        }else if(accountList.get(i) instanceof PersonalAccount){

                            PersonalAccount personalAccount = (PersonalAccount)accountList.get(i);
                            printPersonalAccountDetails(personalAccount);

                        }else if(accountList.get(i) instanceof SavingAccount){

                            SavingAccount savingAccount = (SavingAccount)accountList.get(i);
                            printSavingAccountDetails(savingAccount);
                        }
                    }    
                }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ArrayList<Account> accountList = bank.getList();
        
        if(e.getSource() == showDetailsButton){
            report.setText(" ");
            accInstance(accountList);
        }else if(e.getSource() == menu){
            accCreatedDetails();
            MenuGUI.navigator("menu");
        }
    }
    
}
