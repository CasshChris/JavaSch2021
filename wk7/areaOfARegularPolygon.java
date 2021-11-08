// Assignment 4.5 - Area of a Regular Polygon
// this program will find the area of a regular polygon using the number of sides & the size of a side
import java.util.Scanner;
import java.lang.Math;

public class areaOfARegularPolygon {
    public static void main(String[] args){
        // create Scanneer object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the size of a side & the number of sides
        System.out.print("Enter the number of sides: "); // 5
        double sideNumber = scan.nextDouble();
        System.out.print("Enter the size: "); // 6.5
        double sideSize = scan.nextDouble();
        
        // output the getPolygonArea()
        System.out.println(getPolygonArea(sideNumber, sideSize));

        // close Scanner object
        scan.close();
        
    }

    public static double getPolygonArea(double n, double s){
        // compute & find the polygon
        double area = (n + Math.pow(s, 2)) / (4 * Math.tan(3.14 / n));

        // return the area of the polygon
        return area;
    }
}