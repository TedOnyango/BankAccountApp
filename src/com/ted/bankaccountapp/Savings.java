package com.ted.bankaccountapp;

public class Savings extends Account{
//    List account properties specific to the savings account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

//    Constructor to initialize settings for the savings account
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        acccountNumber = "1" + acccountNumber;
        System.out.println("ACCOUNT NUMBER: " + this.acccountNumber);
        System.out.println("NEW SAVINGS ACCOUNT");


    }

//    List any methods specific to savings account
}
