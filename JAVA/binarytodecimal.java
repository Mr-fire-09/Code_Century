import java.util.Scanner;

public class binarytodecimal {

    public static int binary_to_decimal( int num) {
        int binary_val = num;
        int decimal_val = 0;
        int base = 1;


        while (num > 0) {
            int rem = num % 10;
            decimal_val = decimal_val + rem * base ;
            num = num /= 10;
            base = base *= 2;
        }

        return decimal_val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
         int num = sc.nextInt();


        System.out.println("Decimal number is: " + binary_to_decimal(num));
    }
}