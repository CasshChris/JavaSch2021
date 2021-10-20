// Assignment 3.31 - Calculate CD Value
// this program will use the initial deposit amount, the annual percentage, & the maturity period
import java.util.Scanner;

public class CDvalue {

    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt user for the initial amount, the annual percentage, & the number of months the cd will be held for
        System.out.println("Calculate CD Value\n");
        System.out.print("Enter the initial deposit amount: ");
        double ida = scan.nextDouble(); // 10000
        System.out.print("Enter annual percentage yield: ");
        double ap = scan.nextDouble(); // 5.75
        System.out.print("Enter maturity period(number of months): ");
        int mp = scan.nextInt(); // 18

        // for header
        String m = "Month"; String cdv = "CD Value";
        System.out.printf("%-10s%s%n", m, cdv);

        // 
        for(int j = 1; j <= mp; j++){
           double calc = ida + ida * ap / 1200;

           System.out.printf("%-10d$%.2f%n", j, calc);

           ida = calc;
        }

        scan.close();
    }
    
}
