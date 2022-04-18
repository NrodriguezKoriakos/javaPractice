package com.solvd;

public class Main {

    public static void main(String[] args) {

        StaticTest first = new StaticTest("First");
        System.out.println(first.getName() + " is the instance number: " + StaticTest.getNumInstances());
        StaticTest second = new StaticTest("Second");
        System.out.println(second.getName() + " is the instance number: " + StaticTest.getNumInstances());
        StaticTest third = new StaticTest("Third");
        System.out.println(third.getName() + " is the instance number: " + StaticTest.getNumInstances());

    }
}
