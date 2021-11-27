/**
 * This program will be used to test classes that I write
 */

/** imports */
import wk9.*;

public class Main {
    public static void main(String[] args) {
        /* ~ Rectangle Class ~ */
        System.out.println("\n ~~ Retangle Class ~~ \n");
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.printf("the Width of the Rectangle 0 is %f \n", rec.getWidth());
        System.out.printf("the Width of the Rectangle 1 is %f \n", rec1.getWidth());
        System.out.printf("the Width of the Rectangle 2 is %f \n\n", rec2.getWidth());
        
        System.out.printf("the Height of the Rectangle 0 is %f \n", rec.getHeight());
        System.out.printf("the Height of the Rectangle 1 is %f \n", rec1.getHeight());
        System.out.printf("the Height of the Rectangle 2 is %f \n\n", rec2.getHeight());
        
        System.out.printf("the Area of the Rectangle 0 is %f \n", rec.getArea());
        System.out.printf("the Area of the Rectangle 1 is %f \n", rec1.getArea());
        System.out.printf("the Area of the Rectangle 2 is %f \n\n", rec2.getArea());
        
        System.out.printf("the Perimeter of the Rectangle 0 is %f \n", rec.getPerimeter());
        System.out.printf("the Perimeter of the Rectangle 1 is %f \n", rec1.getPerimeter());
        System.out.printf("the Perimeter of the Rectangle 2 is %f \n", rec2.getPerimeter());
        
        /* ~ Account Class ~ */
        System.out.println("\n ~~ Account Class ~~");
        Account acc = new Account(1122, 20000);
        acc.setAnnaulInterestRate(4.5);
        
        System.out.printf("Account ID: %d\n", acc.getId());
        System.out.printf("Account Balance: $%.2f\n", acc.getBalance());
        
        double wAmount = 2500;
        double dAmount = 3000;
        acc.withdraw(wAmount);
        System.out.printf("Withdrawing $%.2f...\n", wAmount);
        
        acc.deposit(dAmount);
        System.out.printf("Depositing $%.2f...\n", dAmount);
        
        System.out.println("\tDisplaying updated info.");
        System.out.printf("\tAccount ID: %d \n", acc.getId());
        System.out.printf("\tAccount Balance: %.2f \n", acc.getBalance());
        System.out.printf("\tMonthly interest rate: %.2f \n", acc.getMouthlyInterestRate());
        System.out.println("\tDate account was created: " + acc.getDateCreated());
        
        /* ~ Linear Equation Class ~ */
        System.out.println("\n ~~ Linear Equation Class ~~");

        // LinearEquation lin = new LinearEquation();
        
    }
}
