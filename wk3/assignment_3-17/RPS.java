// Assignment 2.17 - Rock, Paper, & Scissor
import java.util.Scanner;
import java.util.Random;
import java.io.Closeable;
import java.util.Arrays;

public class RPS {
   
    public static void main(String[] args) {
        // create Scanner object 
        Scanner scan = new Scanner(System.in);

        // create Random object
        // Random random = new Random();

        // create a random number
        // int compNumber = random.nextInt(3);
        int compNumber = 3;

        // create a array to store rock, paper, scissor
        String[] rpsString = {"Scissors", "Rock", "Paper", "Scissors"};

        // prompt user to input a number
        System.out.print("Scissors (0), Rock (1), Paper (2)");
        int userNumber = scan.nextInt();

        // if the random number is greater then the users input, then the computer won
        // if the random number is less then the users input, then the user won
        if (compNumber > userNumber) {
            System.out.printf("The computers answer is %s. Your answer was %s. The computer won!", rpsString[(int)compNumber], rpsString[(int)userNumber]);
        } else if (userNumber > compNumber) {
            System.out.printf("The computers answer is %s. Your answer was %s. The you won!", rpsString[(int)compNumber], rpsString[(int)userNumber]);
        } else {
            System.out.printf("The computers answer is %s. Your answer was %s. Tie.", rpsString[(int)compNumber], rpsString[(int)userNumber]);
        }
        
    }

}
