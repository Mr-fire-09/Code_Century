import java.util.Scanner;

public class reverceanumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter  a Number :");
        int num = sc.nextInt();

        int reverce = 0,rem;


        while (num != 0) {
            rem = num % 10;
            reverce = reverce * 10 + rem;
            num /= 10;

            
        }

        System.out.println("The Reverce NUmber is :"+ reverce);
    }
}