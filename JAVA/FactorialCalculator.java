import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        // Initialize factorial to 1
        long fact = 1;

        // Check if the number is negative
        if (num < 0) {
            System.out.println("Factorial of a negative number doesn't exist.");
        } else {
            // Calculate factorial using a loop
            for (int i = 1; i <= num; i++) {
                fact *= i; // Multiply fact by i
            }

            // Print the result
            System.out.println("Factorial of " + num + " is " + fact);
        }

        scanner.close(); // Close the scanner
    }
}
