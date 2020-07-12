package com.kodilla.oop.interfejs.bankomat;

public class Application {

    public static void main(String[] args) {
        ATMImpl atm = new ATMImpl();

        atm.operationPayIn(100);
        atm.connection();
        atm.terminate();

        atm.operationWithdraw(90);
        atm.connection();
        atm.terminate();

    }
}
