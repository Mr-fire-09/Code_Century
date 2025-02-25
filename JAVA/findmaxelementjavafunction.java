import java.util.Scanner;

public class findmaxelementjavafunction {

    public static int findmaxelementjava(int[] arr) {
        int max_element = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];

            }
        }

        return max_element;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number of elemnets : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + "elemnets : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("max elemnets  is : " + findmaxelementjava(a));

    }
}
