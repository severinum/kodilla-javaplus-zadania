package com.kodilla.oop.interfejs.telephone;

public class Mobile implements Telephone {
    @Override
    public void callTo(String name) {
        System.out.println("Calling to: " + name);
    }
}
