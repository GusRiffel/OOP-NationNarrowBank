package com.mycompany.nationnarrowbank;

public abstract class Account {
    
   protected int accNumber;
   protected double intRate;
   protected String address;
   protected int telNumber;
   protected double balance;
   
   public Account(int accNo, double intRat, String addrs, int telNo, double bal){
   
       accNumber = accNo;
       intRate = intRat;
       address = addrs;
       telNumber = telNo;
       balance = bal;
   }
   
   public abstract void deposit(double money);
   
   public abstract void withdraw(double money);
   
   public abstract double viewBalance();
   
   public int getAccNumber(){
   
       return accNumber;
   }
   
   public double getBalance(){
   
       return balance;
   }
   
   public double getIntRate(){
   
       return intRate;
   }
   
   public String getAddress(){
   
       return address;
   }
   
   public int getTelNumber(){
   
       return telNumber;
   }
   
   public void setTelNum(int tNum){
   
       telNumber = tNum;
   }
   
   public void setAddress(String add){
   
       address = add;
   }
   
   
}

