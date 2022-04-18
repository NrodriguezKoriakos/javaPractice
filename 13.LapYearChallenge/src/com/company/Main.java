package com.company;

public class Main {

    public static void main(String[] args) {

        int year = 401;
        if (isLapYear(year)){
            System.out.println(year + " Is a lap year");
        } else {
            System.out.println(year + " Isn't a lap year");
        }
    }

    public static boolean isLapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
            }
        }
        return false;
    }
}
