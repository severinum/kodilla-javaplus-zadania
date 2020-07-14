package com.kodilla.oop.abstraction.employee;

public class PieceworkSalaryEmployee implements Employee {
    static final double ITEM_RATE = 5.0;
    private int itemsCount;

    public PieceworkSalaryEmployee(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public double calculateSalary() {
        return itemsCount * ITEM_RATE;
    }
}
