package com.company;

public class Door {

    private String material;
    private String manufacturer;

    public Door(String material, String manufacturer) {
        this.material = material;
        this.manufacturer = manufacturer;
    }

    public void openDoor(){
        System.out.println("You opened the " + this.material + " door.");
        System.out.println("You are inside the room!");
    }
}
