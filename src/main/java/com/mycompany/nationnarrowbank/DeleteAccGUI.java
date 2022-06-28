package com.mycompany.nationnarrowbank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DeleteAccGUI extends JPanel implements ActionListener {

    NationNarrow bank;
    private JTextField accNumberText;
    private JButton delete;
    private JButton menuButton;
    private JLabel accNumber;
    private String accName;
    
    public DeleteAccGUI(NationNarrow bank){
        
        this.bank = bank;
    
        accNumber = new JLabel("Account Number");
        add(accNumber);
        
        accNumberText = new JTextField(20);
        add(accNumberText);
        
        delete = new JButton("Delete");
        delete.addActionListener(this);
        add(delete);
        
        menuButton = new JButton("Menu");
        menuButton.addActionListener(this);
        add(menuButton);
        
    }
    
    public void deleteAccGui(){
    
        this.removeAll();
        accNumber = new JLabel("Account Number");
        add(accNumber);
        
        accNumberText = new JTextField(20);
        add(accNumberText);
        
        delete = new JButton("Delete");
        delete.addActionListener(this);
        add(delete);
        
        menuButton = new JButton("Menu");
        menuButton.addActionListener(this);
        add(menuButton);
        this.revalidate();
        this.repaint();
    }
    
    public void deleteConfirm(String accName){
    
        this.removeAll();
        if(accName != null){
            JOptionPane.showMessageDialog(this, "You have successfully deleted "+accName+"'s account");
            accNumberText.setText(" ");
            deleteAccGui();
            MenuGUI.navigator("menu");
        }else{
            JOptionPane.showMessageDialog(this, "Not an existing account!");
            deleteAccGui();
        }    
       
        this.revalidate();
        this.repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        if(e.getSource() == delete){
            int accNumberSession = Integer.parseInt(accNumberText.getText().trim());
            accName = bank.getNameWithNumber(accNumberSession);
            bank.deleteAccount(accNumberSession);
            deleteConfirm(accName);
            
        }else if(e.getSource() == menuButton){
            accNumberText.setText(" ");
            deleteAccGui();
            MenuGUI.navigator("menu");
        }           
        
    }
    
   
}
