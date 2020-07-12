package com.kodilla.oop.interfejs.shapes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws java.lang.Exception {
        Circle circle = new Circle();
        ShapeDrawer shapeDrawer = new ShapeDrawer(circle);
        shapeDrawer.process();


        Scanner scanner = new Scanner(System.in);
        int value = -1;
        while (value != 0) {
            Shape shape;
            System.out.println("1 - Circle");
            System.out.println("2 - Square");
            System.out.println("0 - exit");
            System.out.println("Choose shape number:");
            value = scanner.nextInt();

            switch (value){
                case 1:
                        shape = new Circle();
                        shapeDrawer = new ShapeDrawer(shape);
                        shapeDrawer.process();
                    break;
                case 2:
                    shape = new Square();
                    shapeDrawer = new ShapeDrawer(shape);
                    shapeDrawer.process();
                    break;
            }

        }
    }
}
