package com.company;

public class Mirror {

    private int size;
    private Reflection reflection;

    public Mirror(int size, Reflection reflection) {
        this.size = size;
        this.reflection = reflection;
    }

    public void sawReflection(){
        System.out.println("You saw your reflection");
    }
}
