package com.solvd;

public class Main {

    public static void main(String[] args) {

        ICalculator calculator = ()-> System.out.println("Welcome to lambda expressions");

        ICalculator2 calculator1 = (string)-> System.out.println(string + "and they're pretty cool");
        ICalculator3 calculator3 = (n1, n2)-> {
            int result = n1*n2;
            return result;
        }

        calculator.message();
        calculator1.message("Hello World I am using Lambda Functions");
        System.out.println(calculator3.calculate(17,10));
    }
}
