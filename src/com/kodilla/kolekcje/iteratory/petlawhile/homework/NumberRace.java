package com.kodilla.kolekcje.iteratory.petlawhile.homework;

import java.util.Random;

public class NumberRace {
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;
        int loopCount = 0;
        Random rand = new Random();
        while( sumaA > sumaB ){
            loopCount++;
            sumaA += rand.nextInt(10);
            sumaB += rand.nextInt(50);
            System.out.println("Loop counter: " + loopCount);
            System.out.println("sumaA = " + sumaA);
            System.out.println("sumaB = " + sumaB);
        }
    }
}
