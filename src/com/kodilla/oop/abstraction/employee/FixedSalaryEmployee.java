package com.kodilla.oop.abstraction.employee;

public class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary){
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}
