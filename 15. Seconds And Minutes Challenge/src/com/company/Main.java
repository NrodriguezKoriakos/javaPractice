package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(195,59));

    }

    public static String getDurationString(int minutes, int seconds){

        int hours = 0;
        if(minutes >=0){
            if (seconds >=0 && seconds <=59){
                hours = minutes/60;
                minutes -= hours*60;


            }

        } else {
            return "Invalid value.";
        }
        return "Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds;
    }
}
