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
        double loanAmount = scan.nextDouble(); // $10000
        System.out.print("Number of Years: ");
        double years = scan.nextDouble(); // 5 years
        
        // calculate with getRates() method
        getRates(loanAmount, years);

        // close Scanner object
        scan.close();

    }

    public static void getRates(double loanAmount, double yearsOfLoan) {
        // declare the starting interest rate
        double interestRate = 0.05000;

        // print header
        System.out.printf("%-1s%20s%20s%n", "Interest Rate", "Monthly Payment", "Total Payment");

        // use a while loop to calculate the Interest Rate, the Monthly Payment, & the Total Payment
        while (interestRate <= 0.0810000) {
            // find the total payment amount
            double totalPayment = loanAmount * Math.pow((1 + interestRate), yearsOfLoan);

            // calculate the monthly amount
            double monthlyPayment = (totalPayment / 12) / yearsOfLoan;

            // output the formatted interest rate, the monthly payment, & the total amount
            String percentString = "%";
            System.out.printf("%8.3f%s%19.2f%22.2f\n", interestRate * 100, percentString, monthlyPayment, totalPayment);

            // for each loop the interest rate will go up ny 1/8
            interestRate += 0.001250;
        }
    }

}