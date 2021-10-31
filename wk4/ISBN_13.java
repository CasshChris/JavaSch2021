// Assignment 3.47 - ISBN-13
// this program will find the ISBN-13 number using the number given by the user
import java.util.Scanner;

public class ISBN_13 {
    public static void main(String[] args){
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // get isbn number from the user
        System.out.print("Enter the first 12 digits of an ISBN-13 as string: ");
        String isbn = scan.next(); // valid = 978013213080, invalid = 97801320

        // check to see of the isbn number is 12 characters long, if not then it is invalid

        if(isbn.length() != 12){
            System.out.println(isbn + " is Invalid input");
            System.exit(0);
        }

        // the for loop will parse throgh the isbn string to find the 13th character
        int checksum = 0;
        for (int i = 0; i < isbn.length(); i++){
            // if the character is even then multiply it by 3
            if ((i + 1) % 2 == 0) {
                checksum += (isbn.charAt(i) - 0) * 3;
            } else {
                checksum += isbn.charAt(i) - 0;
            }
        }

        checksum %= 10;
        checksum = 10 - checksum;

        if (checksum == 10){
            isbn += "0";
        } else {
            isbn += checksum;
        }

        System.out.println("The ISBN-13 number is " + isbn);

        // close Scanner object
        scan.close();
    }

}
