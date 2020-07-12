package com.kodilla.oop.interfejs.rycerz;

public class Application {

    public static void main(String[] args) {

        Quest quest1 = new DeadIslandQuest();
        Quest quest2 = new EliteKnightQuest();

        Knight knightArthur = new Knight(quest1);
        knightArthur.toAction();

        Knight knightLancelot = new Knight(quest2);
        knightLancelot.toAction();
    }
}
