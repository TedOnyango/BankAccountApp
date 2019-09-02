package com.ted.bankaccountapp;

public class BankingAccountApp {

    public static void main(String[] args) {
        Checking checkingacc1 = new Checking("Ted Onyi", "25654", 100);
        Savings savingsacc1 = new Savings("Chris Otieno", "35487", 1000);

        savingsacc1.compound();

        checkingacc1.showInfo();
        System.out.println("***********************");
        savingsacc1.showInfo();






        // Read CSV file and create new accounts based on the data
    }
}
