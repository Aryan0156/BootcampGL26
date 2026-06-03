import java.util.Scanner;

public class Minus {
    public static void main(String[] args) {

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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i % 2 == 0) {
                    a[i][j] = -a[i][j];
                }
            }
        }

        System.out.println("After added minus in Array");

        for (int i = 0; i < n; i++) {
            for (int j= 0; j< n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("after rotating Array");
        for (int i = n-1; i >= 0; i--) {
            for (int j= 0; j< n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }

}