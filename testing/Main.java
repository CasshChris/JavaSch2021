/**
 * This program will be used to test classes that I write
 */

/** imports */
import wk9.*;
import wk10.*;

public class Main {
    public static void main(String[] args) {

        // wk9
        System.out.println("\n ~ Wk9 Package ~ ");

        printRec();
        
        printAcc();
        
        printLinEqu();

        // wk10
        System.out.println("\n\n ~ Wk10 Package ~ ");
        
        printMInt();

        printMRec2D();
        
    }

    // wk9
    public static void printRec() {
        // ~ Rectangle Class ~ 
        System.out.println("\n ~~ Retangle Class ~~ \n");
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        // getWidth()
        System.out.println("\n ~ getWidth()");
        System.out.printf("the Width of the Rectangle 0 is %f \n", rec.getWidth());
        System.out.printf("the Width of the Rectangle 1 is %f \n", rec1.getWidth());
        System.out.printf("the Width of the Rectangle 2 is %f \n", rec2.getWidth());
        
        // getHeight()
        System.out.println("\n ~ getHeight()");
        System.out.printf("the Height of the Rectangle 0 is %f \n", rec.getHeight());
        System.out.printf("the Height of the Rectangle 1 is %f \n", rec1.getHeight());
        System.out.printf("the Height of the Rectangle 2 is %f \n", rec2.getHeight());
        
        // getArea()
        System.out.println("\n ~ getArea()");
        System.out.printf("the Area of the Rectangle 0 is %f \n", rec.getArea());
        System.out.printf("the Area of the Rectangle 1 is %f \n", rec1.getArea());
        System.out.printf("the Area of the Rectangle 2 is %f \n", rec2.getArea());
        
        // getPerimeter()
        System.out.println("\n ~ getPerimeter()");
        System.out.printf("the Perimeter of the Rectangle 0 is %f \n", rec.getPerimeter());
        System.out.printf("the Perimeter of the Rectangle 1 is %f \n", rec1.getPerimeter());
        System.out.printf("the Perimeter of the Rectangle 2 is %f \n", rec2.getPerimeter());
    }

    public static void printAcc() {
        // ~ Account Class ~ 
        System.out.println("\n ~~ Account Class ~~ \n");
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
    }

    public static void printLinEqu() {
        // ~ Linear Equation Class ~
        System.out.println("\n ~~ Linear Equation Class ~~ \n");

        LinearEquation lin = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);

        if (lin.isSolvable()) {
            System.out.printf("X is %1f & Y is %2f", lin.getX(), lin.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }

    // wk10
    public static void printMInt() {
        System.out.println("\n ~~ MyInteger Class ~~ ");

        /* ~ MyInteger ~ */
        // instance creation
        MyInteger inter = new MyInteger(7);
        MyInteger inter1 = new MyInteger(7);
        MyInteger inter2 = new MyInteger(25);

        // isEven()
        System.out.println("\n ~ isEven()");
        System.out.println("Is the first intager even: " + inter.isEven());
        System.out.println("Is the second intager even: " + inter1.isEven());
        System.out.println("Is the third intager even: " + inter2.isEven());
        
        // isOdd()
        System.out.println("\n ~ isOdd()");
        System.out.println("Is the first ingteger odd: " + inter.isOdd());
        System.out.println("Is the second ingteger odd: " + inter1.isOdd());
        System.out.println("Is the third ingteger odd: " + inter2.isOdd());
        
        // isPrime()
        System.out.println("\n ~ isPrime()");
        System.out.println("Is the first integer prime: " + inter.isPrime());
        System.out.println("Is the second integer prime: " + inter1.isPrime());
        System.out.println("Is the third integer prime: " + inter2.isPrime());
        
        // equals()
        System.out.println("\n ~ equals()");
        System.out.println("Is the first ingteger equal to the second integer: " + inter.equals(inter1));
        System.out.println("Is the third ingteger equal to the first integer: " + inter2.equals(inter));
        
        // parseInt()
        System.out.println("\n ~ parseInt()");
        System.out.println("Parse int 100 string value == " + MyInteger.parseInt("100"));
        System.out.println("Parse int 150 char array value == " + MyInteger.parseInt("150".toCharArray()) + "\n");
    }

    public static void printMRec2D() {
        /* ~ MyRectangle2D ~ */
        System.out.println("\n ~~ MyRectangle2D Class ~~ ");

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        // getArea()
        System.out.println("\n ~ getArea()");
        System.out.println("Area: " + r1.getArea());
        
        // getPerimeter()
        System.out.println("\n ~ getPerimeter()");
        System.out.println("Perimeter: " + r1.getPerimeter());
        
        // contains()
        System.out.println("\n ~ contains()");
        System.out.println((r1.contains(3, 3) ? "Contains" : "Does not contain") + " the point (3, 3).");
        System.out.println((r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "Contains" : "Does not contain") + " the rectangle with points (4, 5, 10.5, 3.2)");
        System.out.println((r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? "Overlaps" : "Does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)\n");
    }


}