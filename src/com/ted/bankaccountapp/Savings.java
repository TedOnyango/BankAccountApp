package com.ted.bankaccountapp;

public class Savings extends Account{
//    List account properties specific to the savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

//    Constructor to initialize settings for the savings account
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        acccountNumber = "1" + acccountNumber;
        setSafeDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafeDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }



//    List any methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " + safetyDepositBoxKey

        );

    }


}
