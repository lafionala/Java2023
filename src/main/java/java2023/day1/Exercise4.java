package java2023.day1;

import java.util.Scanner;

public class Exercise4 {

	public static void main (String [] args) {
		// Define Pi-Constant
		final double pi =  3.14159;
		
		// Input radius
        Scanner input = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Radius: " + radius);
        input.close(); //avoid leakage
		
		
		// Calculate Circumference
		double circumference = 2 * radius * pi ;
				
		// Calculate Area
		double area = radius * radius * pi ;
	
		// Print results
		System.out.println("Circumrefence: " + circumference);		
		System.out.println("Area: " + area);	
	}
}


	
