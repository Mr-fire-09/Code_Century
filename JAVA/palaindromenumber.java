import java.util.Scanner;

public class palaindromenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }

        if (num == rev) {
            System.out.println("NUmber is palaindrome ");

        } else {
            System.out.println("NUmber is not palaindrome ");
        }
    }
}