
import java.util.Scanner;

public class greayesyofthreenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int num1 = sc.nextInt();

        System.out.println("Enter second Number :");
        int num2 = sc.nextInt();

        System.out.println("Enter Third Number :");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number first in greater the all numbers  ");

        } else if (num2 > num3 && num2 > num3) {
            System.out.println("Second Number is greater then all numbers");

        } else {
            System.out.println("NUmber three is greater the all numbers ");
        }
    }
}