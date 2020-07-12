package com.kodilla.oop.interfejs.animals;

public class Mouse implements Animal {
    @Override
    public String voice() {
        return "pi!";
    }

    @Override
    public String name() {
        return "Mouse";
    }
}
