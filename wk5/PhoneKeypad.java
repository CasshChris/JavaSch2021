// Assignment 6.21 - Phone Keypad
// 
import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        // create Scanner object
        Scanner scan = new Scanner(System.in);

        // prompt the user for a phone number
        System.out.println("Convert string to numbers");
        System.out.print("Enter a string: ");
        String phoneStr = scan.nextLine();

        // output the reformatted number
        System.out.println(reformatNumber(phoneStr));

        // close Scanner object
        scan.close();

    }

    public static String reformatNumber(String str) {
        // create StringBuilder object
        StringBuilder numbrString = new StringBuilder();
        
        // use a for loop to go through each letter to create the new string
        for (int i = 0; i < str.length(); i++) {
            // create a new character each time
            char character = str.charAt(i);

            if (isNumeric(character)){ // if the character is a number then do this
                numbrString.append(character);
            } else if (isLetter(character)){ // if the character is a letter then do this 
                numbrString.append(getNumber(character));
            } else if (isLetter(character, '-')) { // if the character is a dash Then do this 
                numbrString.append(character);
            }

        }
        
        // return the new string
        return numbrString.toString();
    }

    public static boolean isNumeric(char character) { // check to see if the character is a number between 0 - 9
        return (character >= '0' && character <= '9');
    }

    public static boolean isLetter(char character) { // check to see if the character is 
        // convert the character to a upper case letter 
        character = Character.toUpperCase(character);
        return (character >= 'A' && character <= 'Z');
    }

    public static boolean isLetter(char character1, char character2) { // check to see if the character is a dash
        return character1 == character2;
    }

    public static int getNumber(char character) { // get the number equivalent 
        int invalid_charatcter = -1;
        
        // convert the character to upper case
        character = Character.toUpperCase(character);

        // if the character is between A - O
        if (character >= 'A' && character <= 'O') {
            int number = 2; // where 'A' start
            int n = character - 'A';
            number += (n / 3);

            // return the 
            return number;
        }

        if (character >= 'P' && character <= 'S') {
            return 7;
        }

        if (character >= 'T' && character <= 'V') {
            return 8;
        }

        if (character >= 'W' && character <= 'Z') {
            return 9;
        }

        return invalid_charatcter;
    }
    
}
