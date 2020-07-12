package com.kodilla.oop.interfejs.telephone;

public interface Telephone {
    void callTo(String name);

    default void callToMom(){
        System.out.println("I am calling to mom!");
    }

    static String getMyNumber(){
        return "+48 123 456 789";
    }
}
