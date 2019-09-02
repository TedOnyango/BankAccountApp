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
//        Set account number
        index++;
        this.acccountNumber = setAccountNumber();
        setRate();


    }
    public abstract void setRate();
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()- 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;


    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

//    List common methods-transactions
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("$" + amount + " deposited in your account");
        printBalance();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("$" + balance + " withdrawn");
        printBalance();
    }
    public void transfer(String recipient, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + recipient);
        printBalance();
    }
    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showInfo() {
        System.out.println(
                "\nNAME: " + name +
                        "\nACCOUNT NUMBER: " + acccountNumber +
                        "\nBALANCE: " + balance +
                        "\nRate: " + rate + "%"
        );


    }
}
