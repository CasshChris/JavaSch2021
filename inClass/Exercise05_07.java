// Assignment 5.7 - find the future value for 30yrs
// this program will find the value of a future for each year, for 30yrs & print out the value

import java.lang.Math;
import java.util.Scanner;

public class Exercise05_07 {

    public static void main(String[] args){
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the investment amount & the annual rate
        System.out.print("The amount invested: $");
        double amount = scan.nextDouble(); // 1000
        System.out.print("Annual interest rate: ");
        double rate = scan.nextDouble(); // 9%

        // convert the annual rate to monthly rate
        double monthlyRate = (rate / 12) / 100;

        // get the value using futureOutput()
        futureOutput(amount, monthlyRate);
        
        // close scanner object
        scan.close();
    }
   
    // find the future investment value & return a flolating point number
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        // Calculate the future value
        double value = (investmentAmount * Math.pow((1 + monthlyInterestRate), ((double)(years) * 12))) - 0.01;
        
        // return the value of the future
        return value;
    }
   
    // print the value of the future is a formatted way
    public static void futureOutput(double a, double b){
        // print a header 
        System.out.printf("%-10s%s\n", "Years", "Future Value");
        
        // use for loop to output the investment value 30 times
        for (int i = 1; i <= 30; i++){
            System.out.printf("%-10d $ %.2f\n", i, futureInvestmentValue(a, b, i));
            
        }
        
    }
}