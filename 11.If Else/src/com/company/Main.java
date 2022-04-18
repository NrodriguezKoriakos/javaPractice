package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was:" + finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // Challenge

        System.out.println("Challenge");

        int finalScore = 0;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);

            if (finalScore > 20000) {
                System.out.println("Congrats! You've got a perfect score!");
            } else if (finalScore >= 10000) {
                System.out.println("Mission complete!");
            } else {
                System.out.println("Mission failed!");
            }
        }
        return finalScore;
    }
}
