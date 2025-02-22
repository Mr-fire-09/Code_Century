import java.util.Scanner;

public class gcdnumber {

    public static int findgcd(int num1,int num2){
        int gdc = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++){
            if (num1 % i ==0 && num2 % i == 0) {
                gdc = i;
                
            }
        }
        return gdc;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter  the first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter  the second number :");
        int num2 = sc.nextInt();

        System.out.println("The GCD of " + num1 + " and " + num2 + " is : " + findgcd(num1, num2));
    }

    
}