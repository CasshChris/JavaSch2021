// Assignment 6.39 - Point Postition
// 
import java.util.Scanner;

public class pointPosition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scan.nextDouble(); // 1, 1, 1, 1
        double y0 = scan.nextDouble(); // 1, 1, 1, 1
        double x1 = scan.nextDouble(); // 2, 2, 2, 2
        double y1 = scan.nextDouble(); // 2, 2, 2, 2
        double x2 = scan.nextDouble(); // 1.5, 3, 1, 1
        double y2 = scan.nextDouble(); // 1.5, 3, 1.5, -1

        if (rightOfTheLine(x0,y0,x1,y1,x2,y2)) { // right of line
            System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
        } else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) { // left on line
            System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
        } else if (onTheLineSegment(x0,y0,x1,y1,x2,y2)) { // on the line segment
            System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
        } else if (onTheSameLine(x0,y0,x1,y1,x2,y2)) { // on the same line
            System.out.printf("(%.1f, %.1f) is on the same line from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
        }

        // close Scanner object
        scan.close();

    }
    
    /** Return true if point (x2, y2) is on the left side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }

    /** Return true if point (x2, y2) is on the same
     *  line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }

    /** Return true if point (x2, y2) is on the
     *  line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }

    /** Return true if point (x2, y2) is on the right side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
    }
}
