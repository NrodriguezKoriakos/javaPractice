package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "Hello World";
        System.out.println("My String: " + myString);
        myString = myString + ", my name is Nik ;)";
        System.out.println("My String: " + myString);
        myString = myString + " \u00A9 1997";
        System.out.println("My String: " + myString);

        String numberString = "250.15";
        numberString = numberString + "45.17";
        System.out.println(numberString);



    }
}