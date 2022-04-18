package com.company;

public class Main {

    public static void main(String[] args) {

        Reflection reflection = new Reflection(2);

        Bed bed = new Bed(2,"Home made");
        Mirror mirror = new Mirror(2,reflection);
        Door door = new Door("Wood","Home made");

        Room room = new Room(door,mirror,bed);

        room.useRoom();
    }
}
