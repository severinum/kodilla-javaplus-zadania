package com.kodilla.kolekcje.maps.students;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Student, Grades> students = new HashMap<>();

        Student student1 = new Student("Johnny Mnemonic");
        Student student2 = new Student("Marsellus Wallace");
        Student student3 = new Student("Vincent Vega");
        Student student4 = new Student("Tony Montana");

        Grades grades1 = new Grades(45,52,86,89,99,75,67);
        Grades grades2 = new Grades(78,92,76,67,79,91,94);
        Grades grades3 = new Grades(91,78,65,68,79,83,59);
        Grades grades4 = new Grades(90,76,71,82,69,75,86);

        students.put(student1, grades1);
        students.put(student2, grades2);
        students.put(student3, grades3);
        students.put(student4, grades4);

        for(Map.Entry<Student , Grades> entry: students.entrySet()){
            System.out.println(entry.getKey().getName() + " , average mark: " + entry.getValue().getAverageMark());
        }

    }
}
