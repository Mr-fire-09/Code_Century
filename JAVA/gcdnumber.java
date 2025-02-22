import java.util.*;

public class gcdnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a  first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter a second number :");
        int num2 = sc.nextInt();

        int gcd = 1;


        for(int i = 1; i < Math.min(num1, num2); i++){
            if (num1 % i == 0  && num2 % i == 0) {
                gcd = i;
                
            }

        }
        System.out.println("The gcd is :" + gcd );
    }
}