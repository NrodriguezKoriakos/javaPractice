package com.company;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5/2;
        float myFloatValue = 2.5f/3f;
        double myDoubleValue = 4.700/3.00;

        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("MyFloatValue: " + myFloatValue);
        System.out.println("MyDoubleValue: " + myDoubleValue);
        System.out.println("My finalValue: " + (myIntValue+myFloatValue+myDoubleValue));
    }
}
