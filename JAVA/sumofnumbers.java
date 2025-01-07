package JAVA;

import java.util.Scanner;

public class sumofnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a  Number : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i;

        }

        System.out.println("Sum of Number is :  " + sum);

    }
}