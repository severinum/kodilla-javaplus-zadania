package com.kodilla.oop.interfejs.animals;

public class AnimalRecognizer {

    public String recognize(Animal animal){
        return "I am sure that this is: " + animal.name()
                + " and sounds like: " + animal.voice();
    }
}
