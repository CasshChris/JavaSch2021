// Assignment 3.1 - Solve the quadratic
// 

import java.util.Scanner;
import java.lang.Math;

public class solveQuadratic {

    public static void main(String[] args){
        // create Scanner class
        Scanner scan = new Scanner(System.in);

        // prompt the user for the a, b, & c data & store it
        System.out.println("Solve the quadratic equation");
        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble(); // 1.0, 1, 1
        double b = scan.nextDouble(); // 3, 2.0, 2
        double c = scan.nextDouble(); // 1, 1, 3

        // use the quadratic() to find the answer 
        quadratic(a, b, c);
        
    }
    
    // this method calculates 
    public static void quadratic(double a, double b, double c) {
        // calculate the discriminate
        double discriminate = Math.pow(b, 2) - (4 * a * c);
        
        // if the discriminate is less then zero it is negative - no solution
        // if the discriminate is more then zero it is positive - 2 solutions
        // if the discriminate is equal to zero - 1 solution / the discriminate is removed
        if (discriminate > 0) {
            // calculate the roots
            double r1 = -b + Math.sqrt(discriminate) / (2 * a);
            double r2 = -b - Math.sqrt(discriminate) / (2 * a);
            
            // output the quadratics
            System.out.printf("The equation has two roots: %f and %f ", r1, r2); 
            
        } else if (discriminate == 0) {
            // calcule the root
            double root = - b / (2 * a);

            // output the quadratic
            System.out.printf("The equation has one root: %f ", root);

        } else if (discriminate < 0) {
            // tell the use there is no root
            System.out.println("The equation has no roots");

        }

    }

}