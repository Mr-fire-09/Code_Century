import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        matrixRead(sc, a);
        matrixRead(sc, b);

        int[][] c = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) { // ✅ fixed condition
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Resultant matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " "); // ✅ print in matrix form
            }
            System.out.println();
        }

        sc.close();
    }

    private static void matrixRead(Scanner sc, int[][] a) {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
}
