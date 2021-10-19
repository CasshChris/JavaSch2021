// Assignment 5.21 - Compare various interest rates
// this program will calculate various interest rate of an loan based on the loan amount & the period of years that the loan will be taken out for.

import java.util.Scanner;
import java.lang.Math;

public class CompareInterestRates {

    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // header
        System.out.println("Compare loan interest Rates");
        
        // get the data of the loan
        System.out.print("Loan Amount: $");
        double LAm = scan.nextDouble(); // $10000
        System.out.print("Number of Years: ");
        double yrs = scan.nextDouble(); // 5 years
        
        // calculate with getRates() method
        getRates(LAm, yrs);

    }

    // this 
    public static void getRates(double loanAmount, double yearsOfLoan) {
        double intRate = 5.000;

        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        while (intRate <= 8.000) {
            double perIntRate = intRate / 100;
            double totalPayment = loanAmount * Math.pow((1 + perIntRate), yearsOfLoan);
            double monthlyPayment = (totalPayment / 12) / yearsOfLoan;
            String perStr = "%";
            System.out.printf("%8.3f%s%19.2f%22.2f\n", intRate * 100, perStr, monthlyPayment, totalPayment );
            intRate += 0.0125;

        }
    }

}