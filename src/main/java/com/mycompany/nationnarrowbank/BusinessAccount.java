package com.mycompany.nationnarrowbank;

public class BusinessAccount extends Account {
    
    private String compName;
    private static final double INTEREST_RATE = 0.05;

    public BusinessAccount(int accNo, String addrs, int telNo, double bal,String cpName) {
        
        super(accNo, INTEREST_RATE, addrs, telNo, bal);
        compName = cpName;
    }

    @Override
    public void deposit(double money) {
        
        if(!specialOffer(money)){
            balance += money * 1.02;
        }else{
            balance += money;
        }
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
    
    public boolean specialOffer(double deposit){
    
        if(deposit >= 100000){
            return false;
        }else{
            return true;
        }
        
    }
    
    public String getCompName(){
    
        return compName;
    }
    
    public void setCompName(String cName){
        
        compName = cName;
    }
    
    
    
}
