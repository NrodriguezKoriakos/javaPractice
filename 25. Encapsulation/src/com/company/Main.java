package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(4,"base car");
        Lamborghini lamborghini = new Lamborghini(16,"Gallardo");

        System.out.println(car.startEngine());
        System.out.println(lamborghini.startEngine());
    }
}
