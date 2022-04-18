package com.company;

public class Main {

    public static void main(String[] args) {
	    byte byteVar = 8;
        short shortVar = 27923;
        int intVar = 1000;
        long longVar = 50000 + 10 * (byteVar + shortVar + intVar);
        System.out.println(longVar);

        short secondShortVar = (short) (1000 - (intVar+shortVar+byteVar) /100 );
        System.out.println(secondShortVar);
    }
}
