package com.kodilla.oop.abstraction.employee;

public class Application {
    public static void main(String[] args) {
        FixedSalaryEmployee fixedEmployee = new FixedSalaryEmployee(2000.0);
        HourlySalaryEmployee hEmployee = new HourlySalaryEmployee(40,49);
        BonusSalaryEmployee bonusEmployee = new BonusSalaryEmployee(true);
        PieceworkSalaryEmployee powEmployee = new PieceworkSalaryEmployee(800);

        System.out.println("# ------ Fixed Salary Employee ------ #");
        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(fixedEmployee);
        processor.processPayout();

        System.out.println("# ------ Hourly Salary Employee ------ #");
        processor = new SalaryPayoutProcessor(hEmployee);
        processor.processPayout();

        System.out.println("# ------ Bonus Salary Employee ------ #");
        processor = new SalaryPayoutProcessor(bonusEmployee);
        processor.processPayout();
        System.out.println("# ------ Piece of Work Salary Employee ------ #");
        processor = new SalaryPayoutProcessor(powEmployee);
        processor.processPayout();

    }
}
