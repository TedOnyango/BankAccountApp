package com.ted.bankaccountapp;

import java.util.List;

public class BankingAccountApp {

    public static void main(String[] args) {
        String file = "/home/ted/Videos/NewBankAccounts.csv";
//        Checking checkingacc1 = new Checking("Ted Onyi", "25654", 100);
//        Savings savingsacc1 = new Savings("Chris Otieno", "35487", 1000);
//
//        savingsacc1.compound();
//
//        checkingacc1.showInfo();
//        System.out.println("***********************");
//        savingsacc1.showInfo();

        // Read CSV file and create new accounts based on the data
        List<String []> newAccountHolders = utilities.CSV.read(file);
        for(String [] newAccountHolder: newAccountHolders){
            String name = newAccountHolder[0];
            String sSN = newAccountHolder[1];
            String accountType = newAccountHolder[2];
            double deposit = Double.parseDouble(newAccountHolder[3]);
            if (accountType.equals("Savings")){
                System.out.println("Open Savings Account");
            }
            else if (accountType.equals("Checking")){
                System.out.println("Open Checking Account");
            }
            else {
                System.out.println("Error Reading Account type");
            }
        }
    }
}
