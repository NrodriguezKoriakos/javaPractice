package com.company;

public class Main {

    public static void main(String[] args) {

        double var1 = 20.00d;
        double var2 = 80.00d;

        double var3 = var1 + var2 * 100.00d;

        double var4 = var3%40.00d;

        boolean var5 = (var4==0) ? true:false;

        System.out.println(var5);
        System.out.println("The value of var4 is: " + var4);

        if (!var5){
            System.out.println("\nGot some reminder");
        }
    }
}
