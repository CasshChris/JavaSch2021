// Assignment 7.3 - Count occurence of numbers
// this program will Find the number of occurrences in an array
// program needs work
import java.util.Scanner;

public class numberOfOccurence {
    public static void main(String[] args) {
        // create scanner object
        Scanner scan = new Scanner(System.in);

        // create an array
        int[] integers = new int[10];
        int ars = 10; // array size

        // prompt the user for the numbers
        System.out.print("Enter the integers between 1 and 100: ");
        for (int i = 0; i < ars; i++) {
            int number = scan.nextInt(); // 2 5 6 5 4 3 23 43 2 0

            // check to see if the number is between 1 & 100
            if (number >= 100 || 0 >= number) {
                break;
            }

            // add input to the array
            integers[i] = number;
        }
        
        int[] memo = {};
        // 
        for (int j: integers) {
            if (isInArray(integers, j)) {
                if (Occurrence(integers, j) > 1) {
                    memo[j] = Occurrence(integers, j);
                    if (isInArray(memo, j)) {
                        System.out.println(j + " occures " + Occurrence(integers, j) + " times");
                    }
                } else {
                    memo[j] = Occurrence(integers, j);
                    if (isInArray(memo, j)) {
                       System.out.println(j + " occures " + Occurrence(integers, j) + " time");
                    }
                }
            }
        }
            
        // close scanner object
        scan.close();
    }

    public static int Occurrence(int[] occurrenceArray, double number) {
        int occurrence = 0;

        // using a for each loop, count the number of occurrence
        for (int o: occurrenceArray) { 
            if (o == number){
                occurrence += 1;
            }
        }
        
        return occurrence;
    }

    public static boolean isInArray(int[] array, int number) {
        for(int i = 0; i < array.length; i++) {
            if(number == array[i]){
                return true;
            }
        }
        return false;
    }

}
