package com.kodilla.kolekcje.petle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ArrayTester {
    public void printEven(ArrayList<Integer> theList){
        int tempValue = 0;
        for(int i = 0; i < theList.size(); i++){
            tempValue = theList.get(i);
            if(tempValue % 2 == 0){
                System.out.println(tempValue);
            }
        }
    }
}


public class CollectionAsParam {
    public static void main(String[] args) {
        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for(int i = 0; i < 200; i++){
            theBigList.add(theGenerator.nextInt(100));
        }
        ArrayTester tester = new ArrayTester();
        tester.printEven(theBigList);
    }
}
