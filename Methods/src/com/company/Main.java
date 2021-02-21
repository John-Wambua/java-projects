package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int score =  calculateScore(800,5,100,true);
        System.out.println("Final score "+score);
        int highScore1 = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScore1);

        int highScore2 = calculateHighScorePosition(900);
        displayHighScorePosition("Marcus", highScore2);

        int highScore3 = calculateHighScorePosition(400);
        displayHighScorePosition("Mark", highScore3);

        int highScore4 = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", highScore4);


    }
    public static void displayHighScorePosition(String playerName, int positionInHighScoreTable){
        System.out.println(playerName+ " managed to get into position "+positionInHighScoreTable+ " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore>=1000){
            return 1;
        }else if (playerScore>=500){
            return 2;
        }else if (playerScore > 100){
            return 3;
        }

        return 4;
    }

    public static int calculateScore(int score, int levelCompleted, int bonus, boolean gameOver){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }


}
