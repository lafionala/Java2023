package java2023.day1;

import java.util.Scanner;

public class Exercise5 {
	public static void main (String [] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the integer as a string
        String myinteger = input.nextLine();

        // Close the scanner to prevent resource leak
        input.close();

        // Initialize the result to 1
        int result = 1;

        // Iterate through each character in the input string
        for (int i = 0; i < myinteger.length(); i++) {
            char digitChar = myinteger.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(digitChar)) {
                // Convert the character to an integer and multiply it with the result
                int digit = Character.getNumericValue(digitChar);
                result *= digit;
            }
        }

        // Display the result
        System.out.println("Multiplication of digits: " + result);
    }
}

