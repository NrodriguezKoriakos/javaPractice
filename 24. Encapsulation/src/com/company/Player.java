package com.company;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){

        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("Player died");
        } else {
            System.out.println("Player has: " + healthRemaining() + " health remaining.");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
