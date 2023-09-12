package java2023.day1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N to find the Nth Fibonacci number: ");

        // Read N as an integer
        int n = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate and display the Nth Fibonacci number
        long result = calculateFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    // Method to calculate the Nth Fibonacci number recursively
    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
