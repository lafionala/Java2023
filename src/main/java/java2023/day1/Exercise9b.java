package java2023.day1;

import java.util.Scanner;

public class Exercise9b {

	    public static void main(String[] args) {
	        // Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter N
	        System.out.print("Enter N to find the Nth perfect number: ");

	        // Read N as an integer
	        int n = scanner.nextInt();

	        // Close the scanner to prevent resource leak
	        scanner.close();

	        int count = 0;
	        int number = 2; // Start searching from 2, the first perfect number

	        while (count < n) {
	            if (isPerfectNumber(number)) {
	                count++;
	                if (count == n) {
	                    System.out.println("The " + n + "th perfect number is: " + number);
	                    break;
	                }
	            }
	            number++;
	        }
	    }

	    public static boolean isPerfectNumber(int number) {
	        int sum = 1; // Start with 1 as a divisor

	        for (int divisor = 2; divisor * divisor <= number; divisor++) {
	            if (number % divisor == 0) {
	                sum += divisor;
	                if (divisor != number / divisor) {
	                    sum += number / divisor;
	                }
	            }
	        }

	        return sum == number;
	    }
}

