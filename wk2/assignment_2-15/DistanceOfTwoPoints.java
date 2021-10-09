// Assignment 2.15 - the distance of two points
// this program will use the first point (x1, y1) & the second point (x2, y2) to find the answer to the equation "√(x2 - x1)^2 + (y2 - y1)"
import java.util.Scanner;
import java.lang.Math;

public class DistanceOfTwoPoints {

    public static void main(String[] args){
        // create a scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Find the distance of two points using \"√(x2 - x1)^2 + (y2 - y1)\"\n");

        // prompt the user to input the first point
        System.out.println("Enter the first point");
        System.out.print("x1, y1: ");
        double x1 = scan.nextDouble(); // 1.5
        double y1 = scan.nextDouble(); // -3.4
        
        // prompt the user to input the second point
        System.out.println("Enter the second point");
        System.out.print("x2, y2: ");
        double x2 = scan.nextDouble(); // 4
        double y2 = scan.nextDouble(); // 5

        // close scanner to not waste memory
        scan.close();

        // Calculate x's & y's
        double xCalc = Math.pow((x2 - x1), 2);
        double yCalc = Math.pow((y2 - y1), 2);

        // find the sqare root
        double sqrtCalc = Math.sqrt(xCalc + yCalc); // 8.764...

        // output the result of the equation
        System.out.printf("The distance between two points is %.2f", sqrtCalc);

    }
}