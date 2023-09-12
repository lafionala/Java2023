package java2023.day1;

import java.util.Random;
import java.util.Scanner;

	public class Exercise6 {
		public static void main (String [] args) {
	        // Generate a random number between 0 and 1000
	        Random rand = new Random();
	        int secretNumber = rand.nextInt(1001);

	        // Initialize variables
	        int guess;
	        int numberOfTries = 0;
	        
	        // Create a Scanner object to read user input
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have selected a secret number between 0 and 1000.");
	        
	        do {
	            // Prompt the user for a guess
	            System.out.print("Enter your guess: ");
	            guess = input.nextInt();
	            numberOfTries++;
	            
	            if (guess < secretNumber) {
	                System.out.println("Try a higher number.");
	            } else if (guess > secretNumber) {
	                System.out.println("Try a lower number.");
	            } else {
	                System.out.println("Congratulations! You guessed the secret number: " + secretNumber);
	                System.out.println("It took you " + numberOfTries + " tries.");
	            }
	        } while (guess != secretNumber);
	        
	        // Close the scanner
	        input.close();
	    }
	}
	
	
	
	
	
	
	
	
	
}
