import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number; // Store the original number
        int digit, sum = 0;

        // Find the number of digits
        int numberOfDigits = String.valueOf(number).length();

        // Calculate the sum of digits raised to the power of the number of digits
        while (number > 0) {
            digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, numberOfDigits); // Add the power of the digit
            number /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
