package com.company;

public class Lamborghini extends Car{


    public Lamborghini(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Lamborghini >> Start engine";
    }

    @Override
    public String accelerate() {
        return "Lamborghini >> accelerate";
    }

    @Override
    public String brake() {
        return "Lamborghini >> brake";
    }
}
