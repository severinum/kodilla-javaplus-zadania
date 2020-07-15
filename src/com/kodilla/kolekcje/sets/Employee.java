package com.kodilla.kolekcje.sets;

import java.time.LocalDate;

public class Employee {
    String firstName;
    String lastName;
    LocalDate brithDate;

    public Employee(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.brithDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    @Override
    public int hashCode(){
        return brithDate.getYear() * 100 + brithDate.getMonthValue();
    }

    @Override
    public boolean equals(Object o){
        Employee e = (Employee) o;
        return (firstName.equals(e.getFirstName())) &&
                (lastName.equals(e.getLastName())) &&
                (brithDate.getYear() == e.getBrithDate().getYear()) &&
                (brithDate.getMonthValue() == e.getBrithDate().getMonthValue()) &&
                (brithDate.getDayOfMonth() == e.getBrithDate().getDayOfMonth());
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", born: " + brithDate;
    }
}
