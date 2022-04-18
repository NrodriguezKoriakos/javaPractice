package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Nik",500);
        System.out.println("New score: " + newScore);
        newScore = calculateScore(500);
        System.out.println("New score: " + newScore);
    }

    public static int calculateScore(String playerName, int playerScore){
        System.out.println("Player: " + playerName + " Score: " + playerScore + " points.");
        return playerScore * 1000;

    }

    public static int calculateScore(int playerScore){
        System.out.println("Anonymous player Score: " + playerScore + " points.");
        return playerScore * 10;

    }
}
