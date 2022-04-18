package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        int power = 100;
        boolean isHuman = false;

        if(isAlien == true) {
            System.out.println("It's an Alien!");
            System.out.println("Aliens are cool");
        }

        if (isHuman == true) {
            System.out.println("It's a Human!");
            System.out.println("Humans are cool");
        }

        if (((isAlien == true) && (power >= 100)) || ((isHuman == true) &&(power >= 100))){
            System.out.println("\nIt's a powerfull living form");

        }

        boolean isCar = false;

        if (isCar == true){
            System.out.println("This is not supposed to happen!");
        }

        boolean wasCar = isCar ? true : false;

        int age = 18;
        boolean isOver18 = age >= 18 ? true:false;

        System.out.println(isOver18);


    }
}
