package JAVA;

import java.util.Scanner;

public class posneg {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter  A Number :");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("NUmber is positive ");
            
        }
        else{
                 System.out.println("Number is Negetive");
            
        }
    }
}