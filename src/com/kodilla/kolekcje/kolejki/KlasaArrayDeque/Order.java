package com.kodilla.kolekcje.kolejki.KlasaArrayDeque;

import java.time.LocalDate;

public class Order {
    Book book;
    LocalDate dateOfOrder;

    // constructor with arguments
    public Order(Book book, int year, int month, int day){
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    // method used to printout the order
    @Override
    public String toString(){
        return "Order created: " + dateOfOrder + "\n" +
                " ordered book: " + book;

    }

    //getters
    public Book getBook(){
        return book;
    }

    public LocalDate getDateOfOrder(){
        return dateOfOrder;
    }
}
