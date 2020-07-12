package com.kodilla.oop.interfejs.bankomat;


public class ATMImpl implements ATM {
    @Override
    public void operationPayIn(int amount) {
        System.out.println("You have paid in: $" + amount);
    }

    @Override
    public void operationWithdraw(int amount) {
        System.out.println("Withdrawing $" + amount);
    }
}
