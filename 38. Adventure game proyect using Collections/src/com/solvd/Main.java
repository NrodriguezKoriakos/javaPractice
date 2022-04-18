package com.solvd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are Sitting in front of a computer"));
        locations.put(1, new Location(1,"You are Standing in front of a wood bridge"));
        locations.put(2, new Location(2,"You are Standing next to a bonfire"));
        locations.put(3, new Location(3,"You are Standing at the top of a hill"));
        locations.put(4, new Location(4,"You are Standing outside of a castle"));
        locations.put(5, new Location(5,"You are in the forest"));

        locations.get(1).addExit("W",2); // West
        locations.get(1).addExit("E",3); // East
        locations.get(1).addExit("N",5); // North
        locations.get(1).addExit("S",4); // South

        locations.get(2).addExit("N",5);
        
        locations.get(3).addExit("W",1);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);


        int loc = 1;

        while ( true ) {
            System.out.println ( locations.get ( loc ).getDescription ( ) );
            if ( loc == 0 ) {
                break;
            } else {

                Map < String, Integer > exits = locations.get ( loc ).getExits ( );
                System.out.print ( "Available exits: " );

                for ( String exit : exits.keySet ( ) ) {
                    System.out.print ( exit + ", " );
                }
                System.out.println ( );
                String direction = scanner.nextLine ( ).toUpperCase ( );

                if ( exits.containsKey ( direction ) ) {
                    loc = exits.get ( direction );
                } else {
                    System.out.println ( "You can't go in that direction" );
                }
            }
        }


    }
}
