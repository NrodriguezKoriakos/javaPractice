package com.company;

public class Main {

    public static void main(String[] args) {

        for(double i=1;i!=9;i++){
            System.out.println("1000 at a " + i + "% interest rate: " + calculateInterest(1000,i));
        }
        primeCalculator();
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount + (amount*(interestRate/100));
    }

    public static boolean isPrime(int n){

        if(n==1){
            return  false;
        }

        for(int i=2; i <= n/2; i++){

            if(n%i == 0){
                return false;
            }
        }
        return true;

    }

    public static void primeCalculator(){

        int count = 0;
        for (int i = 1; i != 100; i++){
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
                count ++;
            } else {
                System.out.println(i + " is not a prime number.");
            }

            if (count==3){
                break;
            }
        }

    }
}

