// Assignment 3.31 - Calculate CD Value
// this program will use the initial deposit amount, the annual percentage, & the maturity period
import java.util.Scanner;

public class CDvalue {

    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt user for the initial amount, the annual percentage, & the number of months the cd will be held for
        System.out.println("Calculate CD Value\n");
        System.out.print("Enter the initial deposit amount: ");
        double initialDepositAmount = scan.nextDouble(); // 10000
        System.out.print("Enter annual percentage yield: ");
        double annualPercentage = scan.nextDouble(); // 5.75
        System.out.print("Enter maturity period(number of months): ");
        int maturityPeriod = scan.nextInt(); // 18

        // create a header
        String mouth = "Month"; 
        String cdValue = "CD Value";
        System.out.printf("%-10s%s%n", mouth, cdValue);

        // Use a for loop to calculate the value over time
        for(int j = 1; j <= maturityPeriod; j++){
           double value = initialDepositAmount + initialDepositAmount * annualPercentage / 1200;

           System.out.printf("%-10d$%.2f%n", j, value);

           initialDepositAmount = value;
        }

        scan.close();
    }
    
}
