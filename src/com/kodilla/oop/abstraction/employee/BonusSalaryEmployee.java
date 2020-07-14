package com.kodilla.oop.abstraction.employee;

public class BonusSalaryEmployee implements Employee {
    private double basic;
    final static double BONUS_RATE = 0.2;
    private boolean additionalSale;

    public BonusSalaryEmployee(boolean additionalSale) {
        basic = 2000;
        this.additionalSale = additionalSale;
    }


    public double calculateSalary() {
        if(additionalSale)
            return basic + (basic * BONUS_RATE);
        else
            return basic;
    }
}
