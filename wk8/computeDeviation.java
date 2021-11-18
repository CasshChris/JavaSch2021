// Assignment 7.11 - Compute deviation
// this program will find the mean & standard deviation
import java.util.Scanner;
import java.lang.Math;

public class computeDeviation {
    public static void main(String[] args) {
        // create scanner object
        Scanner scan = new Scanner(System.in);

        // create data intake array 
        double[] numbers = new double[10];

        // get the ten numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble(); // 1.9 2.5 3.7 2 1 6 3 4 5 2
        }

        // output mean & deviation
        System.out.printf("The mean is: %.2f \n", mean(numbers));
        System.out.printf("The standard deviation is: %.2f", deviation(numbers));

        // close scanner object
        scan.close();
    }

    public static double deviation(double[] numbers) {
        // find the mean
        double mean = mean(numbers);

        // declare deviation
        double deviation = 0;
        for (int i = 0; i < numbers.length; i++) {
            deviation += Math.pow(numbers[i] - mean, 2);
        }

        // return √deviation / amount of points - 1
        return Math.sqrt(deviation / (numbers.length - 1));
    }

    public static double mean(double[] numbers) {
        // 
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // return the sum of the points / amount of points
        return sum / numbers.length;
    }
}
