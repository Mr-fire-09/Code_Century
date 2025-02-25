import java.util.Scanner;

public class findmaxelementarray {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter  number of element : ");
        int n = sc.nextInt();

         int []a = new int[n];


         System.out.println("Enter " + n + " elements : ");
         for(int i = 0; i < n; i++  ){
            a[i] = sc.nextInt();
         }


         int max_elements = a[0];

         for (int i = 0; i < n; i++){
            if (a[i] > max_elements) {
                max_elements = a[i];
                
            }
         } 

         System.out.println("max_elements: " + max_elements);

    }
}