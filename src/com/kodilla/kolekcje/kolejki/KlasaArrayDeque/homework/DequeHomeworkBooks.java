package com.kodilla.kolekcje.kolejki.KlasaArrayDeque.homework;

import com.kodilla.kolekcje.kolejki.KlasaArrayDeque.Book;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeHomeworkBooks {

    public static void main(String[] args) {
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray – lexicon for graphicians", "Dante Alighieri", 1572);
        Book theBook4 = new Book("50 lat kacetu", "Stanisław Grzesiuk", 1956);
        Book theBook5 = new Book("Artowood", "Margaret Atwood", 2019);

        Deque<Book> books = new ArrayDeque<>();

        books.push(theBook1);
        books.push(theBook2);
        books.push(theBook3);
        books.push(theBook4);
        books.push(theBook5);

        System.out.println("Stack size: " + books.size());

        Book currentBook = null;
        int stackSize = books.size();
        for(int i = 0;  i < stackSize; i++){
            System.out.println("Taking book out of the stack ...");
            currentBook = books.pop();
        }

        System.out.println("Stack size: " + books.size());
        System.out.println("The last book taken off the stack was: " + (currentBook.getTitle()));

    }

}
