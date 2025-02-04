import java.util.Scanner;

public class lcmnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter second number :");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
}
