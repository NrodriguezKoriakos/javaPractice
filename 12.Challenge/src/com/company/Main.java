package com.company;

public class Main {

    public static void main(String[] args) {

        displayPosition("Nik",getPosition(1500));
        displayPosition("John",getPosition(900));
        displayPosition("Thomas",getPosition(400));
        displayPosition("Albert",getPosition(50));


    }

    public static void displayPosition(String name, int position){

        System.out.println(name + " got to " + position + " position!");

    }

    public static int getPosition(int score){

        if (score >= 1000){
            return 1;
        } else if (score >= 500){
            return 2;
        } else if (score >= 100){
            return  3;
        } else {
            return  4;
        }
    }
}
