package com.ted.bankaccountapp;

public class Checking extends Account{
//    List properties specific to a checking account
    int debitCardNumber;
    int getDebitCardPin;

//    Constructor to initialize the the checking account
    public Checking (String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        acccountNumber = "2" + acccountNumber;
        System.out.println("ACCOUNT NUMBER: " + this.acccountNumber);
        System.out.println("NEW CHECKING ACCOUNT");

    }

//    List any methods specific to the checking account
}
