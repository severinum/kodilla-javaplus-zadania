package com.kodilla.oop.interfejs.animals;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Meow Meow";
    }

    @Override
    public String name() {
        return "Cat";
    }
}
