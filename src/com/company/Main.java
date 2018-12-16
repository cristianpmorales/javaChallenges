package com.company;

public class Main {

    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and <= 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50
    //

    public static  void main(String[] args) {
	    String player = "Bob";
	    // no need to declare a variable score is the score is already a variable in a methof
	    //int score =  1500;
	    displayHighScorePosition(player, calculateHighScorePosition(1500));
//	    score = 900;
        displayHighScorePosition(player, calculateHighScorePosition(900));
//       score = 400;
        displayHighScorePosition(player, calculateHighScorePosition(400));
//       score = 50;
        displayHighScorePosition(player, calculateHighScorePosition(50));
    }
    // Since there is no return type no need to for int
    //  public static int displayHighScorePosition(String playerName, int highScorePosition){
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition);
    }
    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000 ){
//            return 1;
//        }else if (playerScore >= 500){
//            return 2;
//        }else if (playerScore >= 100){
//            return 3;
//        }
//
//        return 4;
//        Written the same code in a different way
        int position = 4; //This is assuming position is always 4

        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }
}
