package com.ted.bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankingAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        // Read CSV file and create new accounts based on the data
        String file = "/home/ted/Videos/NewBankAccounts.csv";
        List<String []> newAccountHolders = utilities.CSV.read(file);
        for(String [] newAccountHolder: newAccountHolders){
            String name = newAccountHolder[0];
            String sSN = newAccountHolder[1];
            String accountType = newAccountHolder[2];
            double deposit = Double.parseDouble(newAccountHolder[3]);
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, deposit));
            }
            else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, deposit));
            }
            else {
                System.out.println("Error Reading Account type");
            }
        }
        for (Account acc : accounts){
            acc.showInfo();

        }
    }
}
