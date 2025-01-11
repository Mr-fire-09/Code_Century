

import java.util.Scanner;

public class greatestoftwonum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First NUmber :  ");
        int num1 = sc.nextInt();

        System.out.println("Enter second NUmber :");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Number 1 is greater ");

        } else {
            System.out.println("NUmber 2 is greater ");
        }

    }
}