import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter   a  number :");
        int num = sc.nextInt();

        int n1 = 0, n2 = 1;

        System.out.println("Fibonacci series :" + n1 + " " + n2);

        for (int i = 2; i < num; i++) {
            int n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;

        }
        System.out.println();

    }
}