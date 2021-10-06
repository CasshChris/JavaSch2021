// Assignment 2.19 - Area of a triangle
// this program will prompt the user for three points (x1, y1), (x2, y2), (x3, y3) & then using the 
import java.util.Scanner;
import java.lang.Math;

public class AreaOfATriangle {

    public static void main(String[] args){
        // create a scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user to input the first point
        System.out.println("Enter the first point");
        System.out.print("x1, y1: ");
        double x1 = scan.nextDouble(); 
        double y1 = scan.nextDouble();
        
        // prompt the user to input the second point
        System.out.println("Enter the second point");
        System.out.print("x2, y2: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        // prompt the user to input the third point
        System.out.println("Enter the third point");
        System.out.print("x3, y3: ");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        // use the findSide() method to find s
        double side1 = findSide(x1, x2, y1, y2);
        double side2 = findSide(x2, x3, y2, y3);
        double side3 = findSide(x3, x1, y3, y1);
        double s = (side1 + side2 + side3) / 2;

        // find the Area of the triangle
        double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double findSide(double a, double b, double c, double d){
        // calculate the intermediate math 
        double xCalc = Math.pow((b - a), 2);
        double yCalc = Math.pow((d - c), 2);

        // find the sqare root
        double s = Math.sqrt(xCalc + yCalc);

        // return side
        return s;
    }
}
