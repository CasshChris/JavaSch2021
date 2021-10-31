// Assignment 3.17 - Rock, Paper, & Scissor
import java.util.Scanner;
import java.util.Random;

public class RPS {
   
    public static void main(String[] args) {
        // create Scanner object 
        Scanner scan = new Scanner(System.in);

        // create Random object
        Random random = new Random();

        // create a random number
        int computerNumber = random.nextInt(3);
        // int computerNumber = 2; // (for debug)

        // prompt user to input a number
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Scissors (0), Rock (1), Paper (2) : ");
        int userNumber = scan.nextInt();
        
        // use rps() to calculate the results of the game
        System.out.println(rps(computerNumber, userNumber));

        // close Scanner object
        scan.close();

    }

    // 
    public static String rps(int computerNumber, int userNumber) {
        // create a array to store rock, paper, scissor
        String[] rpsString = {"Scissors", "Rock", "Paper"};

        // if it's a tie
        if (computerNumber == userNumber){
            String tie = "The computers answer is " + rpsString[computerNumber] + ". Your answer was " + rpsString[userNumber] + ". It's a tie! ";
            return tie;
        }

        // create a string for the switch case
        String winner = "";
        // use a switch case to 
        switch (userNumber) {
            case 0: 
                winner = (computerNumber != 1) ? "The computers answer is " + rpsString[computerNumber] + ". Your answer was " + rpsString[userNumber] + ". You won!" : "The computers answer is " + rpsString[computerNumber] + ". Your answer was " + rpsString[userNumber] + ". You lost!"; break;
            case 1: 
                winner = (computerNumber != 2) ? "The computers answer is " + rpsString[computerNumber] + ". Your answer was " + rpsString[userNumber] + ". You won!" : "The computers answer is " + rpsString[computerNumber] + ". Your answer was " + rpsString[userNumber] + ". You lost!"; break;
            case 2: 
                winner = (computerNumber != 0) ? "The computers answer is " + rpsString[computerNumber] + ". Your answer was " + rpsString[userNumber] + ". You won!" : "The computers answer is " + rpsString[computerNumber] + ". Your answer was " + rpsString[userNumber] + ". You lost!"; break;
        }

        // return the winner string
        return winner;
    }

}
