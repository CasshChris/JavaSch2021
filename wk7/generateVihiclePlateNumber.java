// Assignment 4.25 - Generate a vihicle plate number 
// this program will generate & output a plate number for a car

public class generateVihiclePlateNumber {
    public static void main(String[] args) {
        // create StringBuilder object
        StringBuilder plate = new StringBuilder();
        
        // using a for loop generate three characters
        for (int i = 0; i < 3; i++) {
            // create a random character
            char character = (char)(Math.random() * 26 + 'A');

            // append charascter to plate
            plate.append(character);
        }

        // using a for loop generate four digits
        for (int i = 0; i < 4; i++) {
            // create a random digit
            char digit = (char)(Math.random() * 10 + '0');

            // append the digit to plate
            plate.append(digit);
        }

        System.out.println("The generated vehicle plate number is: " + plate);
    }
}
