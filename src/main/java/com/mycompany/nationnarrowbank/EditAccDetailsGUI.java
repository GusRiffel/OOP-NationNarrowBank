package com.mycompany.nationnarrowbank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class EditAccDetailsGUI extends JPanel implements ActionListener {

    private NationNarrow bank;
    private JLabel editAcc;
    private JButton yesBtn;
    private JButton noBtn;
    private JButton save;
    private JLabel compName;
    private JLabel firstName;
    private JLabel sureName;
    private JLabel address;
    private JLabel telNum;
    private JTextField compNameText;
    private JTextField firstNameText;
    private JTextField sureNameText;
    private JTextField addressText;
    private JTextField telNumText;
    
    public EditAccDetailsGUI(NationNarrow bank){
    
        this.bank = bank;
        
        editAcc = new JLabel();
        add(editAcc);
        
        JLabel confirm = new JLabel("Are you sure you want to edit your details?");
        add(confirm);
        
        yesBtn = new JButton("Yes");
        yesBtn.addActionListener(this);
        add(yesBtn);
        
        noBtn = new JButton("No");
        noBtn.addActionListener(this);
        add(noBtn);
        
    }
    
    private void printBusinessAccountDetails(BusinessAccount businessAcc){
            
        compName = new JLabel("Company Name: ");
        this.add(compName);
        
        compNameText = new JTextField(20);
        compNameText.setText(String.valueOf(businessAcc.getCompName()));
        this.add(compNameText);
        
        address = new JLabel("Address: ");
        this.add(address);
        
        addressText = new JTextField(20);
        addressText.setText(String.valueOf(businessAcc.getAddress()));
        this.add(addressText);
        
        telNum = new JLabel("Telephone Number: ");
        this.add(telNum);
        
        telNumText = new JTextField(20);
        telNumText.setText(String.valueOf(businessAcc.getTelNumber()));
        this.add(telNumText);
        
        this.revalidate();
        this.repaint();
        
    }
    
    
    
    private void printPersonalAccountDetails(PersonalAccount personalAcc) {
        
               
        firstName = new JLabel("First Name");
        this.add(firstName);
        
        firstNameText = new JTextField(20);
        firstNameText.setText(String.valueOf(personalAcc.getFirstName()));
        this.add(firstNameText);
        
        sureName = new JLabel("Sure Name: "+String.valueOf(personalAcc.getSureName()));
        this.add(sureName);
        
        sureNameText = new JTextField(20);
        sureNameText.setText(String.valueOf(personalAcc.getFirstName()));
        this.add(sureNameText);
        
        address = new JLabel("Address: "+String.valueOf(personalAcc.getAddress()));
        this.add(address);
        
        addressText = new JTextField(20);
        addressText.setText(String.valueOf(personalAcc.getAddress()));
        this.add(addressText);
        
        telNum = new JLabel("Telephone Number: "+String.valueOf(personalAcc.getTelNumber()));
        this.add(telNum);
        
        telNumText = new JTextField(20);
        telNumText.setText(String.valueOf(personalAcc.getTelNumber()));
        this.add(telNumText);
        
        
    }
    
    private void printSavingAccountDetails(SavingAccount savingAcc) {
        
        firstName = new JLabel("First Name");
        this.add(firstName);
        
        firstNameText = new JTextField(20);
        firstNameText.setText(String.valueOf(savingAcc.getFirstName()));
        this.add(firstNameText);
        
        sureName = new JLabel("Sure Name: "+String.valueOf(savingAcc.getSureName()));
        this.add(sureName);
        
        sureNameText = new JTextField(20);
        sureNameText.setText(String.valueOf(savingAcc.getFirstName()));
        this.add(sureNameText);
        
        address = new JLabel("Address: "+String.valueOf(savingAcc.getAddress()));
        this.add(address);
        
        addressText = new JTextField(20);
        addressText.setText(String.valueOf(savingAcc.getAddress()));
        this.add(addressText);
        
        telNum = new JLabel("Telephone Number: "+String.valueOf(savingAcc.getTelNumber()));
        this.add(telNum);
        
        telNumText = new JTextField(20);
        telNumText.setText(String.valueOf(savingAcc.getTelNumber()));
        this.add(telNumText);
        
    }
    
    public void accInstance(ArrayList<Account> accountList, int accNumber){
    
        this.removeAll();
        for(int i = 0; i < accountList.size(); i++){
            
            if(accountList.get(i).getAccNumber() == accNumber){    
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
        
        this.revalidate();
        this.repaint();
    }
    
    public void setNewDetails(ArrayList<Account> accountList, int accNumber){
    
        for(int i = 0; i < accountList.size(); i++){
            
            if(accountList.get(i).getAccNumber() == accNumber){    
                if(accountList.get(i) instanceof BusinessAccount){

                    BusinessAccount businessAcc = (BusinessAccount)accountList.get(i);
                    String newCompName = compNameText.getText();
                    String newAddress = addressText.getText();
                    int newTelNumber = Integer.parseInt(telNumText.getText());
                    businessAcc.setCompName(newCompName);
                    businessAcc.setAddress(newAddress);
                    businessAcc.setTelNum(newTelNumber);
                    break;


                }else if(accountList.get(i) instanceof PersonalAccount){

                    PersonalAccount personalAccount = (PersonalAccount)accountList.get(i);
                    String newFirstName = firstNameText.getText();
                    String newSureName = sureNameText.getText();
                    String newAddress = addressText.getText();
                    int newTelNumber = Integer.parseInt(telNumText.getText());
                    personalAccount.setFirstName(newFirstName);
                    personalAccount.setSureName(newSureName);
                    personalAccount.setAddress(newAddress);
                    personalAccount.setTelNum(newTelNumber);
                    break;

                }else if(accountList.get(i) instanceof SavingAccount){

                    SavingAccount savingAccount = (SavingAccount)accountList.get(i);
                    String newFirstName = firstNameText.getText();
                    String newSureName = sureNameText.getText();
                    String newAddress = addressText.getText();
                    int newTelNumber = Integer.parseInt(telNumText.getText());
                    savingAccount.setFirstName(newFirstName);
                    savingAccount.setSureName(newSureName);
                    savingAccount.setAddress(newAddress);
                    savingAccount.setTelNum(newTelNumber);
                    break;
                }
            }
        }    
    }
    
    public void clearAccComponents(){
   
        this.removeAll();
        editAcc = new JLabel();
        add(editAcc);
        
        JLabel confirm = new JLabel("Are you sure you want to edit your details?");
        add(confirm);
        
        yesBtn = new JButton("Yes");
        yesBtn.addActionListener(this);
        add(yesBtn);
        
        noBtn = new JButton("No");
        noBtn.addActionListener(this);
        add(noBtn);
        this.revalidate();
        this.repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ArrayList<Account> accountList = bank.getList();
        int accNumber = bank.getAccManage();
            
        if(e.getSource() == yesBtn){
            
            if(!bank.verifyAccount(accNumber)){
                JOptionPane.showMessageDialog(this, "Something went wrong!");
            }else{
                editAcc.setText(" ");
                accInstance(accountList, accNumber);
                
                save = new JButton("Save");
                save.addActionListener(this);
                add(save);        
            }
        }else if(e.getSource() == noBtn){
            MenuGUI.navigator("manageAccGUI");
         
        }else if(e.getSource() == save){
            setNewDetails(accountList, accNumber);
            clearAccComponents();
            MenuGUI.navigator("menu");
            JOptionPane.showMessageDialog(this, "Details updated!");
        }
                               
        
    }
    
}
