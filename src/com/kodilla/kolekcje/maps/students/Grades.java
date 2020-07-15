package com.kodilla.kolekcje.maps.students;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Integer> grades = new ArrayList<>();

    public Grades(int...grades) {
        for(int grade: grades){
            this.grades.add(grade);
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageMark(){
        double sum = 0;
        if(grades.size() > 0){
            for(Integer grade: this.grades){
                sum += grade;
            }
            return sum / this.grades.size();
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Grades: " + grades;
    }
}
