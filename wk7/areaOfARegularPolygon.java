// Assignment 4.5 - Area of a Regular Polygon
// this program will find the regular polygon using the number of sides & the size of a side
import java.util.Scanner;
import java.lang.Math;

public class areaOfARegularPolygon {
    public static void main(String[] args){
        // create Scanneer object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the size of a side & the number of sides
        System.out.print("Enter the number of sides: ");
        double sideNumber = scan.nextDouble();
        System.out.print("Enter the size: ");
        double sideSize = scan.nextDouble();
        
        // output the getPolygonArea()
        System.out.println(getPolygonArea(sideNumber, sideSize));

        // close Scanner object
        scan.close();
        
    }

    public static double getPolygonArea(double n, double s){
        // calculate & find the polygon
        double area = (n + Math.pow(s, 2)) / (4 * Math.tan(3.14 / n));

        return area;
    }
}