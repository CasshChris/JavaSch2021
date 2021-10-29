// Assignment 6.31 - Credit card number validation
// this program will find the 
import java.util.Scanner;

public class creditCardValidation {

    public static final int visa_prefix = 4;
    public static final int masterCard_prefix = 5;
    public static final int americanExpress_prefix = 37;
    public static final int discover_prefix = 6;

    static int[] prefix = new int[] { visa_prefix, masterCard_prefix, americanExpress_prefix, discover_prefix };

    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for the 
        System.out.print("Enter a credit card number: ");
        long creditCardNumber = scan.nextLong(); // valid = 4388576018410707, invalid = 43885760184026243885760184026266

        // if the isValid() method returns "true", print the card number & tell the use it is valid
        // if the isValid() methid returns "false", print the card number & tell the user its invalid 
        if (isValid(creditCardNumber)) {
            System.out.println(creditCardNumber + " is valid.");
        } else {
            System.out.println(creditCardNumber + " is INVALID");
        }

        // close Scanner object
        scan.close();
    }

    // Return true if the card number is valid
    public static boolean isValid(long number) {
        // if the number 
        if (getSize(number) > 16 || getSize(number) < 13) {
            return false;
        }

        // 
        for (int i = 0; i < prefix.length; i++) {

            if (getPrefix(number, prefix[i]) == prefix[i]){
                // prefix match
                break;
            }
            if (i < prefix.length - 1) {
                // no prefix return false
                return false;
            }

        }

        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return sum % 10 == 0;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {

        if (d > number) {
            return false;
        }

        long difference = (getSize(number) - getSize(d));

        return d == (int)(number / Math.pow(10, difference));

    }


    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {

        if (prefixMatched(number, k)){
            return k;
        }

        return number;
    }

    // Get the result from Step 2
    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;
        while (number > 0) {
            number /= 10;
            int digit = getDigit((int) (number % 10) * 2);
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    // Return sum of odd-place digits in number
    public static int sumOfOddPlace(long number) {

        int sum = 0;
        while (number > 0) {

            int digit = (int) (number % 10);
            digit = getDigit(digit);
            sum += digit;
            number /= 100;
        }
        return sum;
    }

    // Return this number if it is a single digit, otherwise,
    // return the sum of the two digits
    public static int getDigit(int number) {
        return (number > 9) ? number - 9 : number;
    }

    // Return the number of digits in d
    public static int getSize(long d) {
        // declare the size
        int size = 0;

        // the digits are greater then
        while (d > 0) {
            size++;
            d /= 10;
        }

        // return the size of the number
        return size;
    }
}
