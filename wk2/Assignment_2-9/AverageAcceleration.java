// Assignment 2.9 - Average Acceleration
// this program will prompt the user for three inputs for the equation v1 - v0 / t. Once the inputs are given then the program will calculate using the equation
// the inputs are 5.5, 50.9, 4.5

import java.util.Scanner;

public class AverageAcceleration {

    public static void main(String[] args) {
        // create the Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the inputs
        System.out.println("Enter v0, v1, and t: ");
        double v0 = scan.nextDouble();
        double v1 = scan.nextDouble();
        double t = scan.nextDouble();

        // close scanner
        scanner.close();

        // calculate the equation
        double calculation = (v1 - v0) / t;

        // output the calculation
        System.out.printf("The average acceleration is %.3f ", calculation);
    }
}