package com.company;

public class Main {

    public static void main(String[] args) {

        //GearBox gearBox = new GearBox(6);
        GearBox mcLaren = new GearBox(6);
        // GearBox.Gear first = gearBox.new Gear(1,12.5);
        // mcLaren.addGear(1,5.3);
        //mcLaren.addGear(2,10.6);
        //mcLaren.addGear(3,15.9);
        // GearBox.Gear second = gearBox.new Gear(2,16.6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

    }
}
