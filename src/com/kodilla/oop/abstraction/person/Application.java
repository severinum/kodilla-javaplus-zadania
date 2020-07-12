package com.kodilla.oop.abstraction.person;

public class Application {
    public static void main(String[] args) {
        Male male = new Male("John");
        String name = male.getName();
        System.out.println(name);
        male.voice();
    }
}
