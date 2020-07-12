package com.kodilla.oop.abstraction.bank;

public class ATMTransaction extends BankTransaction {
    @Override
    protected void step1() {
        System.out.println("Please insert card ...");
    }

    @Override
    protected void step2() {
        System.out.println("Please enter PIN ...");
    }

    @Override
    protected void step3() {
        System.out.println("Please enter amount to withdraw ...");
    }

    @Override
    protected void step7() {
        System.out.println("[Money dispensing]");
    }

    @Override
    protected void step8() {
        System.out.println("Thank You for using our ATM services!");
    }
}
