package com.kodilla.kolekcje.iteratory.petlawhile;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

/* Class Employee represents an employee in the company */
class Employee {
    String firstName;
    String lastName;
    LocalDate birthDate;

    // Constructor
    public Employee(String firstName, String lastName, int yearOfBirth,
                    int monthOfBirth, int dayOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        // Class LocalDate provided by java.time library is used
        // to store dates. Constructor of(int year, int month, int day) could be
        // used to initialize LocalDate variable value
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    @Override
    public int hashCode(){
        // methods getYear() and getMonthValue() of LocalDate class could be used
        // to retrieve a year and month of stored date
        return birthDate.getYear() * 100 + birthDate.getMonthValue();
    }

    @Override
    public boolean equals(Object o){
        Employee e = (Employee) o;
        return (firstName.equals(e.getFirstName())) &&
                (lastName.equals(e.getLastName())) &&
                (birthDate.getYear() == e.getBirthDate().getYear()) &&
                (birthDate.getMonthValue() == e.getBirthDate().getMonthValue()) &&
                (birthDate.getDayOfMonth() == e.getBirthDate().getDayOfMonth());
    }

    @Override
    public String toString(){
        return firstName + ", " + lastName + ", born: " + birthDate;
    }

    // getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        // Creating 5 example Employee objects
        Employee worker1 = new Employee("Steven", "Newmack", 1987, 6, 30);
        Employee worker2 = new Employee("Jennifer", "Nowak", 1988, 2, 28);
        Employee worker3 = new Employee("Robert", "Greenfield", 1987, 6, 15);
        Employee worker4 = new Employee("Monica", "Smith", 1984, 10, 18);
        Employee worker5 = new Employee("Stephanie", "Jackson", 1985, 4, 3);

        // Creating a HashSet and filling it with objects
        Set<Employee> workersSet = new HashSet<>();
        workersSet.add(worker1);
        workersSet.add(worker2);
        workersSet.add(worker3);
        workersSet.add(worker4);
        workersSet.add(worker5);

        // Print out every worker from the set using while loop
        Iterator<Employee> iteratorWorkersSet = workersSet.iterator();
        while (iteratorWorkersSet.hasNext()){
            Employee currentWorker = iteratorWorkersSet.next();
            System.out.println(currentWorker);
        }
        System.out.println("Loop has finished its work");


    }
}
