import java.util.Scanner;

public class StrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        // Save the number in another variable
        int temp = n;
        int sum = 0;
        int[] f = new int[10];  // Array to store factorial values
        f[0] = 1;
        f[1] = 1;

        // Precomputing factorial values from 0 to 9
        for (int i = 2; i < 10; i++) {
            f[i] = f[i - 1] * i;
        }

        // Extracting digits and summing factorial values
        while (temp > 0) {
            int r = temp % 10; // Get the last digit
            temp /= 10; // Remove the last digit
            sum += f[r]; // Add the factorial of the digit
        }

        // Checking if it's a strong number
        if (sum == n) {
            System.out.println("Yes, " + n + " is a Strong number");
        } else {
            System.out.println("No, " + n + " is not a Strong number");
        }
    }
}
