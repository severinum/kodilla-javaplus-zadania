package com.kodilla.oop.abstraction.bank;

public class Application {

    public static void main(String[] args) {
        ATMTransaction transaction = new ATMTransaction();
        transaction.process();
    }

}
