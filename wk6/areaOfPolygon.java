// Assignment 6.35 - Area of a polygon
// this program will find the area of a polygon based on the side of the polygon
import java.util.Scanner;
import java.lang.Math;

public class areaOfPolygon {
    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the side length
        System.out.print("Enter the side: ");
        double side = scan.nextDouble(); // 5.5

        // print the area
        System.out.println("The area of the pentagon is " + area(side));

        // close Scanner object
        scan.close();
    }

    public static double area(double side) {
       // calculate the area
       double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

       return area;
    }
    
}
