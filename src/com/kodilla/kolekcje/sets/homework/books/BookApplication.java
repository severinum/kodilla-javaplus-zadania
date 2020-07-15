package com.kodilla.kolekcje.sets.homework.books;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        Book book1 = new Book("The Army of E", "Marteen Stove", 2009);
        Book book2 = new Book("A Visit of Goon Squad", "Jennifer Egan", 2010);
        Book book3 = new Book("Hannibal", "Tom Harris", 1999);
        Book book4 = new Book("Misery", "Stephen King", 1987);
        Book book5 = new Book("Circe", "Madeline Miller", 2018);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for(Book book: books){
            if(book.getPublicationYear() < 2010) {
                System.out.println(book);
            }
        }
    }
}
