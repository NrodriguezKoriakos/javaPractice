package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth: ");
        int year = scanner.nextInt();
        scanner.close();

        System.out.println("My name is: " + name + " and i am " + (2022 - year) + " years old.");
    }
}
