import java.util.Scanner;

public class octaltodecimal {

    public static int convertoctaltodecimal(int num) {
        int decimal_val = 0;
        int base = 1;

        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            decimal_val += last_digit * base;
            base = base * 8;

        }

        return decimal_val;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a  octal Number : ");
        int num = sc.nextInt();

        System.out.println("The Decimal Number is :" + convertoctaltodecimal(num));
    }
}