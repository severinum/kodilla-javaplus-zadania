package com.kodilla.kolekcje.pomiary;

import java.util.ArrayList;
import java.util.List;

public class CollectionCreate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int n = 0; n < 8000000; n++){
            list.add(n);
        }

        System.out.println("Quantity of elements in the collection: " + list.size());

        // Deleting last element from the collection
        long begin = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();

        // Displaying time of the delete operation
        System.out.println("Removing last element has taken: " + (end - begin) + " ms") ;

        // Deleting first element from collection
        begin = System.currentTimeMillis();
        list.remove(0);
        end = System.currentTimeMillis();

        // Displaying time of deletion
        System.out.println("Removing first element has taken: " + (end - begin + " ms"));


        //Adding element at the end of the collection
        begin = System.nanoTime();
        list.add(list.size());
        end = System.nanoTime();

        // Displaying time of the operation
        System.out.println("Adding element at the od of the collection has taken: " + (end - begin) + "ns");

        //Adding element at the beginning of the collection
        begin = System.nanoTime();
        list.add(0, list.size());
        end = System.nanoTime();

        // Displaying time of the operation
        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + "ns");
    }
}
