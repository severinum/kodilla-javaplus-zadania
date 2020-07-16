package com.kodilla.kolekcje.kolejki.KlasaArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrdersQueueExample {

    public static void main (String[] args) throws java.lang.Exception {

        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray – lexicon for graphicians", "Dante Alighieri", 1572);

        // Create 5 sample orders
        Order theOrder1 = new Order(theBook1, 2017, 6, 28);
        Order theOrder2 = new Order(theBook2, 2017, 6, 28);
        Order theOrder3 = new Order(theBook1, 2017, 6, 29);
        Order theOrder4 = new Order(theBook2, 2017, 6, 30);
        Order theOrder5 = new Order(theBook3, 2017, 6, 30);

        // create the FIFO queue
        Deque<Order> theOrders = new ArrayDeque<>();
        // check size of the queue
        System.out.println("Queue is created. It's size: " + theOrders.size());

        // Put the orders into the queue
        theOrders.offer(theOrder1);
        theOrders.offer(theOrder2);
        theOrders.offer(theOrder3);
        theOrders.offer(theOrder4);
        theOrders.offer(theOrder5);

        // Check size of the queue
        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println();

        // examine the order at beginning if the queue
        System.out.println("First order in the queue is:\n" + theOrders.peek());
        System.out.println();

        // get objects form queue
        Order temporaryOrder;
        temporaryOrder = theOrders.poll();

        // here you can do something with order taken from the queue
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();

        // Check size of the queue
        System.out.println("Queue is emptied. It's size: " + theOrders.size());
        System.out.println();

        // Check what was taken as last
        System.out.println("Last order taken from queue was:\n" + temporaryOrder);
        System.out.println();

        // Check size of the queue  = 0
        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println();

    }
}
