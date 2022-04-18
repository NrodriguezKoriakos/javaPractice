package com.company;

public class Main {

    public static void main(String[] args) {
/*       Player player = new Player();

        player.name = "Nik";
        player.health = 100;
        player.weapon = "Katana";

        int damage = 45;
        player.loseHealth(damage);
        player.loseHealth(damage);
        player.loseHealth(damage/3); */

        EnhancedPlayer player = new EnhancedPlayer("Nik",500,"Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
