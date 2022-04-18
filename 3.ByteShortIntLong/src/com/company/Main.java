package com.company;

public class Main {

    public static void main(String[] args) {

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println(" ");
        System.out.println("Integer minimum value: " + myMinValue);
        System.out.println("Integer maximum value: " + myMaxValue);
        System.out.println("Busted max value: " + (myMaxValue + 1));
        System.out.println("Busted min value: " + (myMinValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("");
        System.out.println("");
        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("");
        System.out.println("");
        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("");
        System.out.println("");
        System.out.println("long minimum value: " + myMinLongValue);
        System.out.println("long maximum value: " + myMaxLongValue);

        System.out.println(" ");
        System.out.println(" ");
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        System.out.println(" ");
        System.out.println(" ");
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
    }
}
