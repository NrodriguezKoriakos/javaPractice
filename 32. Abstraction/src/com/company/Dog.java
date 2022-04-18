package com.company;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void breath() {
        System.out.println("Breathing...");
    }
}
