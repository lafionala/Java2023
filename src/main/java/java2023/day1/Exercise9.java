package java2023.day1;

public class Exercise9 {
	    public static void main(String[] args) {
	        System.out.println("Perfect numbers less than 100,000:");

	        for (int number = 2; number < 100000; number++) {
	            if (isPerfectNumber(number)) {
	                System.out.println(number);
	            }
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
	
	
	
