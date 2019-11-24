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
            System.out.println("NEW ACCOUNTS");
            System.out.println(newAccountHolder[0]);
            System.out.println(newAccountHolder[1]);
            System.out.println(newAccountHolder[2]);
            System.out.println(newAccountHolder[3]);

        }
    }
}
