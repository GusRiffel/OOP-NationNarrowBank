package com.mycompany.nationnarrowbank;

public class SavingAccount extends Account {
    
    private String firstName;
    private String sureName;
    private String dateBirth;
    private static final double INTEREST_RATE = 0.02;
    

    public SavingAccount(int accNo, String addrs, int telNo, double bal, String fName, String sName, String dBirth) {
        
        super(accNo, INTEREST_RATE, addrs, telNo, bal);
        firstName = fName;
        sureName = sName;
        dateBirth = dBirth;
    }

    @Override
    public void deposit(double money) {
       balance += money;
    }

    @Override
    public void withdraw(double money) {
       balance -= money; 
    }

    @Override
    public double viewBalance() {
        double currentBalance = getBalance();
        return currentBalance;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getSureName(){
        return sureName;
    }
    
    public String getDateBirth(){
        return dateBirth;
    }
    
    public void setFirstName(String fName){
        firstName = fName;
    }
    
    public void setSureName(String sName){
        sureName = sName;
    }
    
}
