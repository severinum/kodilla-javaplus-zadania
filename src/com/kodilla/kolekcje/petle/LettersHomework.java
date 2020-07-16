package com.kodilla.kolekcje.petle;

import java.util.*;

public class LettersHomework {

    private static List<String> oddLetters = new ArrayList<>();
    private static List<String> evenLetters = new ArrayList<>();

    public static void main(String[] args) {
        Deque<String> letters = new ArrayDeque<>();
        Random rand = new Random();
        for(int i = 0; i < 50; i++) {
            String aCount = "a";
            for(int n = 0; n < rand.nextInt(51); n++ ){
                aCount += "a";
            }
            letters.offer(aCount);
        }

        sortStrings(letters);

        // display even letters strings count
        System.out.println("\tStrings with even number of letters 'a' : " + evenLetters.size());

        for(String str: evenLetters){
            System.out.println(str);
        }

        // display odd letters strings count
        System.out.println("\tStrings with odd number of letters 'a' : " + oddLetters.size());

        for(String str: oddLetters){
            System.out.println(str);
        }

    }

    public static void sortStrings(Deque<String> letters){
        if(letters.size() > 0){
            for(String str: letters){
                if(str.length() % 2 == 0){
                    evenLetters.add(str);
                } else {
                    oddLetters.add(str);
                }
            }
        }
    }

}
