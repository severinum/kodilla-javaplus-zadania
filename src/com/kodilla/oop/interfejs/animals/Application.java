package com.kodilla.oop.interfejs.animals;

public class Application {

    public static void main(String[] args) {
        AnimalRecognizer recognizer = new AnimalRecognizer();
        String recognizedAnimal = recognizer.recognize(new Cat());
        System.out.println(recognizedAnimal);
    }
}
