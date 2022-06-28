package com.mycompany.nationnarrowbank;

import java.util.ArrayList;
import java.util.Scanner;

public class NationNarrow {
    
    Scanner input = new Scanner(System.in);
    private ArrayList<Account> accountList = new ArrayList();
    
    private int accNumber = 1;
    private int accManageATM;
    
    
    public NationNarrow(){};
    
    public void createBusinessAccount(String address, int telNumber, double balance, String compName){
                    
        Account account1 = new BusinessAccount(accNumber++, address, telNumber, balance, compName);
        accountList.add(account1);
        
    }
    
    public void createPersonalAcc(String address, int telNumber, double balance, String firstName, String sureName, String dateBirth){
    
        Account account1 = new PersonalAccount(accNumber++, address, telNumber, balance, firstName, sureName, dateBirth);
        accountList.add(account1);
    }
    
    public void createSavingAcc(String address, int telNumber, double balance, String firstName, String sureName, String dateBirth){
    
        Account account1 = new SavingAccount(accNumber++, address, telNumber, balance, firstName, sureName, dateBirth);
        accountList.add(account1);
    }
    
    public boolean verifyAccount(int accNumber){
    
        for(int i = 0; i < accountList.size(); i++){
        
            if(accNumber == accountList.get(i).getAccNumber()){
                accManageATM = accountList.get(i).getAccNumber();
                return true;
            }
        }
        return false;
    }
    
    public int getAccManage(){
        return accManageATM;
    }
    
    public int getAccNumber(){
        return accNumber;
    }
    
    public String getNameWithNumber(int number){
    
        for (int i = 0; i < accountList.size(); i++){
            if(accountList.get(i).getAccNumber() == number){
                if(accountList.get(i) instanceof BusinessAccount){
                
                    BusinessAccount bAccount = (BusinessAccount)accountList.get(i);
                    return bAccount.getCompName();
                }else if(accountList.get(i) instanceof PersonalAccount){
                
                    PersonalAccount pAccount = (PersonalAccount)accountList.get(i);
                    return pAccount.getFirstName();
                }else if(accountList.get(i) instanceof SavingAccount){
                
                    SavingAccount sAccount = (SavingAccount)accountList.get(i);
                    return sAccount.getFirstName();
                }
            
            }
        }
        return null;
    
    }
    
    public Account getAccount(int accNumber){
        
        for(int i = 0; i < accountList.size(); i++){
        
            if(accNumber == accountList.get(i).getAccNumber()){
                return accountList.get(i);
            }
        }
        return null;
    }
    
    public void deleteAccount(int accNumber){
        
        for(int i = 0; i < accountList.size(); i++){
        
            if(accNumber == accountList.get(i).getAccNumber()){
                accountList.remove(i);
                System.out.println("Success");
                break;
            }
        }
        System.out.println("This account doesn't exist");
    }
    
    public ArrayList getList(){
        
        return accountList;
    }
    
    public boolean testString(String chamana){
    
        if(chamana.trim().equalsIgnoreCase(" ")){
            System.out.println("escreve algo ai carai");
            return false;
        }
        return true;
    }
    
}
