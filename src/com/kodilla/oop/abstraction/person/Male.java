package com.kodilla.oop.abstraction.person;

public class Male extends  Person {

    public Male(String name){
        super(name);
    }

    public void voice(){
        System.out.println("Hey there from male !");
    }
}
