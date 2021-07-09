package com.company;

public class Main {

    public static void main(String[] args) {
        int playerScore = 1500;
        String playerName = "Kyle";
        int playerPosition= calculateHighScorePosition(playerScore);
        displayHighScore(playerName, playerPosition);

        playerScore = 900;
        playerName = "Ryan";
        playerPosition= calculateHighScorePosition(playerScore);
        displayHighScore(playerName, playerPosition);

        playerScore = 400;
        playerName = "Tim";
        playerPosition= calculateHighScorePosition(playerScore);
        displayHighScore(playerName, playerPosition);

        playerScore = 50;
        playerName = "Jose";
        playerPosition= calculateHighScorePosition(playerScore);
        displayHighScore(playerName, playerPosition);

    }


    public static void displayHighScore(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
       // if (playerScore>= 1000){
       //     return 1;
       // }else if (playerScore >= 500) {
       //     return 2;
       // }else if (playerScore >= 100){
       //     return 3;
       // }
       //     return 4;
        // another way (preventing 4 return statements)
        int position = 4; //assuming position 4 will be returned
        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >=500){
            position = 2;
        }else if (playerScore >=100) {
            position = 3;
        }
        return position;
    }

}
