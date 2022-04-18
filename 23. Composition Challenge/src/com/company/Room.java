package com.company;

public class Room {

    private Door door;
    private Mirror mirror;
    private Bed bed;

    public Room(Door door, Mirror mirror, Bed bed) {
        this.door = door;
        this.mirror = mirror;
        this.bed = bed;
    }

    public void useRoom(){
        useDoor();
        useMirror();
        useBed();
    }

    private void useBed(){
        this.bed.layInBed();
    }
    private void useMirror(){
        mirror.sawReflection();
    }
    private void useDoor(){
        door.openDoor();
    }
}
