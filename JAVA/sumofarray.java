import  java.util.Scanner;


public class sumofarray {

    public  static int sum_of_array(int [] arr, int n ){
        int total = 0;
        for(int num : arr){
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();


        int [] arr = new int[n];

        System.out.println("Enter   the elements of the array :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The sum of the array is : " + sum_of_array(arr, n));
    }
}