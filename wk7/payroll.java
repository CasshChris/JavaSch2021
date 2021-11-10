// Assignment 4.23 - Payroll 
// this program will find the net pay, gross pay, deductions, & federal/state holding
import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the name, hoursWorked, payRate, federalTax, stateTax
        System.out.print("Enter employee's name: "); 
        String name = scan.next(); // Smith
        System.out.print("Enter number of hours worked in a week: "); 
        double hours = scan.nextDouble(); // 10
        System.out.print("Enter hourly pay rate: "); 
        double payRate = scan.nextDouble(); // 9.75
        System.out.print("Enter federal tax withholding rate: "); 
        double federalTax = scan.nextDouble(); // 20%
        System.out.print("Enter state tax withholding rate: "); 
        double stateTax = scan.nextDouble(); // 9%

        // get the users payroll
        getPayroll(name, hours, payRate, federalTax, stateTax);

        // close Scanner object
        scan.close();

    }

    public static void getPayroll(String name, double hours, double pay, double fed, double state) {
        // convert state & fed to percent 
        fed = fed / 100;
        state = state / 100;

        // compute the gross pay 
        double gross = hours * pay;

        // compute the state & fed withholding
        double fedHold = gross * fed;
        double stateHold = gross * state;

        // compute the deduction & net pay 
        double deduction = fedHold + stateHold;
        double net = gross - deduction;

        // output 
        System.out.println("\nEmployee Name: " + name );
        System.out.println("Hours Worked: " + hours );
        System.out.printf("Pay Rate: $%.2f\n", pay);
        System.out.printf("Gross Pay: $%.2f\n", gross);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding (%.1f%s) : $%.2f\n", (fed * 100), ("%"), fedHold);
        System.out.printf("\tFederal Withholding (%.1f%s) : $%.2f\n", (state * 100), ("%"), stateHold);
        System.out.printf("\tTotal Deductions: $%.2f\n", deduction);
        System.out.printf("Net Pay: $%.2f", net);
    }

}
