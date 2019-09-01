package com.ted.bankaccountapp;

public class BankingAccountApp {

    public static void main(String[] args) {
        Checking checkingacc1 = new Checking("Ted Onyi", "25654", 1400);
        Savings savingsacc1 = new Savings("Chris Otieno", "35487", 4558);

        checkingacc1.showInfo();
        System.out.println("***********************");
        savingsacc1.showInfo();

        savingsacc1.deposit(2000);
        checkingacc1.withdraw(200);
        savingsacc1.transfer("Ted", 250);



        // Read CSV file and create new accounts based on the data
    }
}
