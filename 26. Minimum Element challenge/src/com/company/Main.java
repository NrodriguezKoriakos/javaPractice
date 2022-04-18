package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the length of the array: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("The minimum value is: " + min);


    }

    private static int[] readIntegers(int count){

        int[] array = new int[count];

        for (int i =0; i<array.length; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i =0; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
            }

        }
        return min;
    }
}
