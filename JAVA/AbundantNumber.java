import java.util.Scanner;

public class AbundantNumber {

    public static boolean isAbundant(int num) {
        int sum = 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;

            }
        }

        return sum > num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (isAbundant(num)) {
            System.out.println(num + " is an abundant number");
        } else {
            System.out.println(num + " is not an abundant number"); //

        }
    }
}