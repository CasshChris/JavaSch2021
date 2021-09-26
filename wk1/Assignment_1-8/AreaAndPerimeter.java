// Assignment 1.8 - Area & Primeter
// this program will take the radius of a circle (in the case 5.5) & pi in order to find the area & the perimeter of the circle

public class AreaAndPerimeter {

    public static void main(String[] args) {
        // declare the Radius & declare pi
        double radius = 5.5;
        double pi = 3.14159;

        // calculate the Perimeter & the Area of the circle
        double perimeter = 2 * radius * pi;
        double area = (radius * radius) * pi;

        // output the perimeter & the area
       System.out.println("The Perimeter of the circle: " + perimeter); 
       System.out.println("The Area of the circle: " + area); 
    }
}