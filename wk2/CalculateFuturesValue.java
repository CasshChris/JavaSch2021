// Assignment 2.21 - Calculate Futures investment value
// this program will calculate futures based on the input given by the user

import java.util.Scanner;
import java.lang.Math;

public class CalculateFuturesValue {
   
    public static void main(String[] agrs){
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt user to input the investment amount
        System.out.print("Enter the invstment amount: ");
        double amount = scan.nextDouble(); // 1000.56
        
        // prompt user to input the annual rate
        System.out.print("Enter the annual rate: ");
        double annual = scan.nextDouble(); // 4.25

        // prompt user to input the number of years
        System.out.print("Enter number of years: ");
        double years = scan.nextDouble(); // 1

        // close scanner object to save memory
        scan.close();

        // use the futuresV() method to find the futures value
        double future = futureValue(amount, annual, years);

        // output the value
        System.out.printf("Future value is $%.2f", future);

    }

    // this method will find futures
    public static double futureValue(double investmentAmount, double annualRate, double years){
        // find the monthly rate
        double monthlyRate = (annualRate / 12) / 100;

        // find the futures value
        double value = investmentAmount * Math.pow((1 + monthlyRate), (years * 12));

        return value;
    }
}
