package com.kodilla.kolekcje.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Steven", "Newmack", 1987, 6, 30);
        Employee worker2 = new Employee("Jennifer", "Nowak", 1988, 2, 28);
        Employee worker3 = new Employee("Robert", "Greenfield", 1987, 6, 1);
        Employee worker4 = new Employee("Monica", "Smith", 1984, 10, 18);
        Employee worker5 = new Employee("Stephanie", "Jackson", 1985, 4, 3);

        Set<Employee> workersSet = new HashSet<>();
        workersSet.add(worker1);
        workersSet.add(worker2);
        workersSet.add(worker3);
        workersSet.add(worker4);
        workersSet.add(worker5);

        System.out.println("worker 3 exists in the set: " + workersSet.contains(worker3));

        for(Employee theWorker: workersSet){
            //System.out.println(theWorker.getFirstName() + " " + theWorker.getLastName());
            //System.out.println("# -------------------------------------------- #");
            if(theWorker.getBrithDate().getYear() >= 1986) {
                System.out.println(theWorker);
            }
        }
    }
}
