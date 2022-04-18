package com.company;

public class Birds extends Animal implements ICanFly{

    public Birds(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
