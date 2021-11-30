// Assignment 3.33 - compare the cost of two itemms
// this program take four inputs (price1, price2), (weight1, weight2) & compare them to find which item (2 items) has a better price
import java.util.Scanner;

public class CompareCost {

    public static void main(String[] args){
        // create scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the data of the two items
        System.out.print("Enter weight & price for package 1: ");
        double weight1 = scan.nextDouble(); // 50
        double price1 = scan.nextDouble(); // 24.59
        System.out.print("Enter weight & price for package 2: ");
        double weight2 = scan.nextDouble(); // 25
        double price2 = scan.nextDouble(); // 11.99

        // calculate the compared price
        double item1 = price1 / weight1;
        double item2 = price2 / weight2;

        // for debug
        // System.out.println(item1);
        // System.out.println(item2);

        // if item1 is more then item2, then item1 is better
        // if item2 is more then item1, then item2 is better
        if (item1 < item2) {
            System.out.println("Package 1 has a better price.");

        } else if (item2 < item1) {
            System.out.println("Package 2 has a better price.");

        } else {
            System.out.println("Both prices are equal");
        }

        // close Scanner object
        scan.close();

    }
    
}
