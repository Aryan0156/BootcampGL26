import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int n,m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        System.out.println("Enter the number of columns");
        m = sc.nextInt();

        int[][] a = new int[n][m];

        int choice;

        do {

            System.out.println("1. Enter Row");
            System.out.println("2. Enter Column");
            System.out.println("3. Exit");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Enter row number:");

                int r = sc.nextInt();

                System.out.println("Enter row elements:");

                for (int j = 0; j < m; j++) {

                    a[r][j] = sc.nextInt();
                }

            } else if (choice == 2) {

                System.out.println("Enter column number:");

                int c = sc.nextInt();

                System.out.println("Enter column elements:");

                for (int i = 0; i < m; i++) {

                    a[i][c] = sc.nextInt();
                }

            } else if (choice == 3) {

                System.out.println("Program Ended");

            } else {

                System.out.println("Invalid Choice");
            }

            System.out.println("Matrix:");

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    System.out.print(a[i][j] + " ");
                }

                System.out.println();
            }
            System.out.println("_____________________________________________________________");

        } while (choice != 3);
        sc.close();
    }
}