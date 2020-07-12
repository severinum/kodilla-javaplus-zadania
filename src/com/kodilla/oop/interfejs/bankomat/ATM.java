package com.kodilla.oop.interfejs.bankomat;

public interface ATM {

    public void operationPayIn(int amount);
    public void operationWithdraw(int amount);

    default public void connection(){
        System.out.println("Connecting with your bank ...");
    }

    default public void terminate(){
        System.out.println("Transacion finished.");
    }

}
