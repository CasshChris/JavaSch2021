/**
 * This program will be used to test classes that I write
 */

/** imports */
import wk9.Rectangle;

public class Main {
    public static void main(String[] args) {
        //Rectangle rec = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle();
        
        System.out.println("width: " + rec2.getWidth());
        System.out.println("height: " + rec2.getHeight());
        System.out.println("Area: " + rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());
    }
}
