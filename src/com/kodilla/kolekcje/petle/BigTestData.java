package com.kodilla.kolekcje.petle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BigTestData {
    public static void main(String[] args) {
        List<Integer> theBigList = new ArrayList<>();
        Random theGenerator = new Random();
        for(int n = 0; n < 2000000; n++){
            theBigList.add(theGenerator.nextInt(50000));
        }
        System.out.println("The Big List contains now : " + theBigList.size() + " objects" );
    }


}
