package com.company;

public class Bed {

    private int size;
    private String manufacturer;

    public Bed(int size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public void layInBed(){
        System.out.println("You ley in your bed.");
    }
}
