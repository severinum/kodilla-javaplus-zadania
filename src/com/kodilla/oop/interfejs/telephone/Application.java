package com.kodilla.oop.interfejs.telephone;

public class Application {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.callTo("Adam");

        mobile.callToMom();

        System.out.println(Telephone.getMyNumber());
    }
}
