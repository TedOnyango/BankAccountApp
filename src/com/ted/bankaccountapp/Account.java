package com.ted.bankaccountapp;

public abstract class Account implements IBaseRate{
//    List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance ;
    String acccountNumber;
    double rate;
    static int index = 10000;

//    Constructor to set based properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("Name: " + name + " SSN: " + sSN + " "+ "Balance: " + balance);
//        Set account number
        index++;
        this.acccountNumber = setAccountNumber();

    }
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()- 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;

    }

//    List common methods

}
