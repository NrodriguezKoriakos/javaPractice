package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,30,50);

        MotherBoard motherBoard = new MotherBoard("Supreme Legacy Limited", "Apple", 8, 4,"IOS");
        Case theCase = new Case("Supreme Legacy Limited","Apple","Hex",dimensions);
        Monitor monitor = new Monitor("Supreme Legacy Limited","Apple",27, new Resolution(20,25));

        PersonalComputer pc = new PersonalComputer(theCase,monitor,motherBoard);

        pc.powerUp();
    }
}
