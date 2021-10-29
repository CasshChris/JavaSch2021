// Assignment 6.7 - future investment value
// this program will find the future value based on a investment amount & the interest rate
import java.util.Scanner;
import java.lang.Math;

public class futureInvestValue {
    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the base amount & the interest rate
        System.out.println("Calculate Futures Investment");
        System.out.print("Enter the amount invested: ");
        double investmentAmount = scan.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = scan.nextDouble();

        // convert the annual rate to monthly rate
        double monthlyRate = (interestRate / 12) / 100;

        getFormatted(investmentAmount, monthlyRate);

        // close Scanner object
        scan.close();
        
    }

    public static void getFormatted(double amount, double rate){
        // format the data from futureInvestmentValue()
        System.out.printf("%-10s%s\n", "Years", "Future Value");

        // print the the interest rate 30 times
        for (int yrs = 1; yrs <= 30; yrs++){
            System.out.printf("%-10d $ %.2f\n", yrs, futureInvestmentValue(amount, rate, yrs));
            
        }

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        // Calculate the future value
        double value = (investmentAmount * Math.pow((1 + monthlyInterestRate), ((double)(years) * 12))) - 0.01; // 
        
        // return the value of the future
        return value;
    }

    
}
