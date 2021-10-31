// Assignment 3.25 - Find intersecting point
// this program will find the the intersection of two points
import java.util.Scanner;

public class IntersectingPoints {
    public static void main(String[] args){
        // creater scanner class  
        Scanner scan = new Scanner(System.in);

        // prompt the user for point data
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = scan.nextDouble(); // 2
        double y1 = scan.nextDouble(); // 2
        double x2 = scan.nextDouble(); // 5, 7
        double y2 = scan.nextDouble(); // -1.0, 6.0
        double x3 = scan.nextDouble(); // 4.0
        double y3 = scan.nextDouble(); // 2.0
        double x4 = scan.nextDouble(); // -1.0
        double y4 = scan.nextDouble(); // -2.0
    
        //find the insection using Cramer's rule
        // calculate the co efficient
        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double const1 = (y1 - y2) * x1 - (x1 - x2) * y1;
        double const2 = (y3 - y4) * x3 - (x3 - x4) * y3;
    
        // find x & y
        double adBc = a * d - b * c;
        double x = (const1 * d - b * const2) / adBc;
        double y = (a * const2 - const1 * c) / adBc;
    
        // check to see if the point are parallel
        if (adBc == 0) {
            System.out.println("The two lines are parallel!");
        } else {
            System.out.printf("The intersecting point is at ( %f, %f )", x, y);
        }

        // close Scanner object
        scan.close();

    }

}
