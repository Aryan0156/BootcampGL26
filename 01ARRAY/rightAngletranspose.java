import java.util.Scanner;

public class rightAngletranspose {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Rotated Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After Rotated Array");

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j>=0; j--) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
