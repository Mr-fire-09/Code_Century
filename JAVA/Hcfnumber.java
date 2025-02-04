import java.util.Scanner;

public class Hcfnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int hcf = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;

            }
        }

        System.out.println("Hcf of " + num1 + " and " + " Hcf of " + num2 + " is" + hcf);

    }
}