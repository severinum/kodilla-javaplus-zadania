package com.kodilla.kolekcje.petle;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class MyObject {
    int value = 0;

    public MyObject(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o){
        MyObject myObj = (MyObject) o;
        if(myObj.getValue() == value){
            return true;
        } else {
            return false;
        }
    }

    public int getValue() {
        return value;
    }
}

 class FindDuplicates {
     public static void main(String[] args) {
         List<MyObject> listOfNumbers = new LinkedList<>();
         Random theGenerator = new Random();
         for(int i=0; i<100; i++){
             listOfNumbers.add(new MyObject(theGenerator.nextInt(100)));
         }

         // checking for duplicates
         Iterator<MyObject> iterator = listOfNumbers.iterator();
         while (iterator.hasNext()){
             MyObject examinedObject = iterator.next();

             // comparing whit every element of list
             for (int k=0; k < listOfNumbers.size(); k++){
                 // preventing to compare the object with himself
                 if (listOfNumbers.get(k).hashCode() != examinedObject.hashCode()){
                     // if duplicated
                     if (listOfNumbers.get(k).equals(examinedObject)){
                         System.out.println("Duplicated: " + examinedObject.getValue());
                     }
                 }
             }
         }
     }
}
