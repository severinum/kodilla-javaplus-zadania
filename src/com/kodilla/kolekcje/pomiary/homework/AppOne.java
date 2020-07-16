package com.kodilla.kolekcje.pomiary.homework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppOne {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 35000; i++){
            books.add(new Book( Integer.toString(i), Integer.toString(i)));
        }
        long end = System.currentTimeMillis();
        // Display time of creating List with 35 000 Books
        System.out.println("Time to create list with 35 000 Book objects: " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        books.remove(new Book("0","0"));
        end = System.currentTimeMillis();

        // Display time to remove first element Book from the list
        System.out.println("Time to remove first Book from the list: "  + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        books.remove(new Book("34999","34999"));
        end = System.currentTimeMillis();

        // Display time to remove last element Book from the list
        System.out.println("Time to remove last Book from the list: "  + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        books.add(0, new Book("00","00"));
        end = System.currentTimeMillis();

        System.out.println("Time to add new Book ad the beginning of the list: "+ (end - begin) + " ms");

        begin = System.currentTimeMillis();
        books.add(new Book("XX","XX"));
        end = System.currentTimeMillis();

        System.out.println("Time to add new Book ad the end of the list: " + (end - begin) + " ms");

        System.out.println("Books list size: " + books.size());


        // ---------------------------------- HashMap --------------------------------------------- //
        Map<String, Book> booksMap = new HashMap<>();

        for (int i = 1; i <= 35000; i++){
            String mapKey = generateMapKey(i);
            booksMap.put(mapKey, new Book(Integer.toString(i), Integer.toString(i)));
        }

        for (Map.Entry<String, Book> entry: booksMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue().getAuthor() + " , " + entry.getValue().getTitle());
        }

        begin = System.currentTimeMillis();
        Book book = booksMap.get("AA-7340-Book");
        end = System.currentTimeMillis();

        System.out.println("Time required to find book by the key: " + (end - begin) + " ms ( " + book + " )" );

        begin = System.currentTimeMillis();
        booksMap.put("XY-9999999-Book", new Book("Book author name","Book title"));
        end = System.currentTimeMillis();

        System.out.println("Time to add new book to map: " + (end - begin) + " ms");


    }

    private static String generateMapKey(int i) {
        return "AA-" + Integer.toString(i) + "-Book";
    }
}
