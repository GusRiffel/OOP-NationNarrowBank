package com.mycompany.nationnarrowbank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ManageAccGUI extends JPanel implements ActionListener {

    private NationNarrow bank;
    private JButton deposit;
    private JButton withdraw;
    private JButton balance;
    private JButton editInfo;
    private JButton manageAccButton;
    private JButton menuButton;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton verify;
    private JLabel accNumber;
    private JLabel viewBalance;
    private JLabel depositLabel;
    private JLabel withdrawLabel;
    private JLabel teste;
    private JLabel welcome;
    private JTextField accNumberText;
    private JTextField depositAmountText;
    private JTextField withdrawAmountText;
    
    
    public ManageAccGUI(NationNarrow bank){
    
        this.bank = bank; 
        
        teste = new JLabel();
        add(teste);
        
        accNumber = new JLabel("Account Number");
        add(accNumber);
        
        accNumberText = new JTextField(20);
        add(accNumberText);
        
        verify = new JButton("Verify");
        verify.addActionListener(this);
        add(verify);
        
        menuButton = new JButton("Menu");
        menuButton.addActionListener(this);
        add(menuButton);
    }
    
    public void verifyAccount(){
    
        int sessionAccNumber = Integer.parseInt(accNumberText.getText());
        if(!bank.verifyAccount(sessionAccNumber)){
                JOptionPane.showMessageDialog(this, "Account doesn't exist!");
            }else{
                accNumberText.setText(" ");
                manageAccGUI();
            }
    }
    
    public void verifyGUI(){
        
        this.removeAll();
        teste = new JLabel();
        add(teste);
        
        accNumber = new JLabel("Account Number");
        add(accNumber);
        
        accNumberText = new JTextField(20);
        add(accNumberText);
        
        verify = new JButton("Verify");
        verify.addActionListener(this);
        add(verify);
        
        menuButton = new JButton("Menu");
        menuButton.addActionListener(this);
        add(menuButton);
        
        this.revalidate();
        this.repaint();
    }
    
    public void depositGUI(){
    
        this.removeAll();
        depositLabel = new JLabel("Deposit:");
        add(depositLabel);
        
        depositAmountText = new JTextField(20);
        add(depositAmountText);
        
        depositButton = new JButton("Confirm Deposit");
        depositButton.addActionListener(this);
        add(depositButton);
        
        manageAccButton = new JButton("Back");
        manageAccButton.addActionListener(this);
        add(manageAccButton);
        
        this.revalidate();
        this.repaint();
       
    }
    
    public void confirmDeposit(){
    
        int money = Integer.parseInt(depositAmountText.getText());
        int sessionAccNumber = bank.getAccManage();
        Account accDetails = bank.getAccount(sessionAccNumber);
        accDetails.deposit(money);
        depositAmountText.setText(" ");
    }
    
    public void withDrawGUI(){
    
        this.removeAll();
        withdrawLabel = new JLabel("Withdraw:");
        add(withdrawLabel);
        
        withdrawAmountText = new JTextField(20);
        add(withdrawAmountText);
        
        withdrawButton = new JButton("Confirm Withdraw");
        withdrawButton.addActionListener(this);
        add(withdrawButton);
        
        manageAccButton = new JButton("Back");
        manageAccButton.addActionListener(this);
        add(manageAccButton);
        
        this.revalidate();
        this.repaint();
    }
    
    public void confirmWithdraw(){
    
        int money = Integer.parseInt(withdrawAmountText.getText());
        int sessionAccNumber = bank.getAccManage();
        Account accDetails = bank.getAccount(sessionAccNumber);
        accDetails.withdraw(money);
        withdrawAmountText.setText(" ");
    }
    
    public void showBalance(){
        this.removeAll();
        viewBalance = new JLabel();
        add(viewBalance);
        
        manageAccButton = new JButton("Back");
        manageAccButton.addActionListener(this);
        add(manageAccButton);
        
        int sessionAccNumber = bank.getAccManage();
        Account accDetails = bank.getAccount(sessionAccNumber);
        String newBalance = String.valueOf(accDetails.viewBalance());
        viewBalance.setText("Balance "+newBalance);
        
        this.revalidate();
        this.repaint();
    }
    
    public void manageAccGUI(){
   
        this.removeAll();
        welcomeFunction();
        deposit = new JButton("Deposit");
        deposit.addActionListener(this);
        add(deposit);
        
        withdraw = new JButton("Withdraw");
        withdraw.addActionListener(this);
        add(withdraw);
        
        balance = new JButton("Balance");
        balance.addActionListener(this);
        add(balance);
        
        editInfo = new JButton("Edit information");
        editInfo.addActionListener(this);
        add(editInfo);
        
        menuButton = new JButton("Menu");
        menuButton.addActionListener(this);
        add(menuButton);
        
        this.revalidate();
        this.repaint();
    }
    
    public void welcomeFunction(){
    
        ArrayList<Account> accountList = bank.getList();
        int sessionAccNumber = bank.getAccManage();
        
        for(int i = 0; i < accountList.size(); i++){
            
            if(accountList.get(i).getAccNumber() == sessionAccNumber){
                
                if(accountList.get(i) instanceof BusinessAccount){
                
                    BusinessAccount businessAcc = (BusinessAccount)accountList.get(i);
                    String compName = businessAcc.getCompName();
                    welcome = new JLabel("Welcome "+compName+" how can I help you today?");
                    add(welcome);
                    
                }else if(accountList.get(i) instanceof PersonalAccount){
                   
                    PersonalAccount personalAccount = (PersonalAccount)accountList.get(i);
                    String firstName = personalAccount.getFirstName();
                    welcome = new JLabel("Welcome "+firstName+" how can I help you today?");
                    add(welcome);
                
                }else if(accountList.get(i) instanceof SavingAccount){
                
                    SavingAccount savingAccount = (SavingAccount)accountList.get(i);
                    String firstName = savingAccount.getFirstName();
                    welcome = new JLabel("Welcome "+firstName+" how can I help you today?");
                    add(welcome);
                }
            }    
        }        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
           
         if(e.getSource() == deposit){
            depositGUI();
        }else if(e.getSource() == withdraw){
            withDrawGUI();
        }else if(e.getSource() == balance){
            showBalance();
        }else if(e.getSource() == editInfo){
            verifyGUI();
            MenuGUI.navigator("editAccDetailsGUI");
        }else if(e.getSource() == manageAccButton){
            manageAccGUI();
        }else if(e.getSource() == depositButton){
            JOptionPane.showMessageDialog(this, "Deposit sucessful!");
            confirmDeposit();
            manageAccGUI();
        }else if(e.getSource() == withdrawButton){
            JOptionPane.showMessageDialog(this, "Withdraw sucessful!");
            confirmWithdraw();
            manageAccGUI();
        }else if(e.getSource() == menuButton){
            verifyGUI();
            MenuGUI.navigator("menu");
        }else if(e.getSource() == verify){
            verifyAccount();
        }
    }
    
}
