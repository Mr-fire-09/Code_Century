import java.util.Scanner;


public class Mathobject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value for a : ");
        int a = sc.nextInt();

        System.out.println("Enter a value for b : ");
        int b = sc.nextInt();


        int Maxval = Math.max(a, b);
        int Minval = Math.min(a, b);


        System.out.println("Max value is : " + Maxval);
        System.out.println("Min value is : " + Minval);
    }
}