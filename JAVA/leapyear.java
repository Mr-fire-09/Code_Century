import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year :");
        int year = sc.nextInt();

        if (year % 400==0) {
            System.out.println("It Was a leap year ");
            
        }
        else if (year % 4 == 0 && year % 100 != 0) {

            System.out.println("IT Was a Leap Year ");
            
            
        }

        else {
            System.out.println("IT Was Not A  leap year ");
        }
    }
}