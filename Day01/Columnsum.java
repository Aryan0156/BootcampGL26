import java.util.Scanner;

public class Columnsum {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int maxsum = 0;
        int sum ;
        int element =0;
        int j;
        for (int i=0; i<n; i++) {
            sum = 0;
            for (j=0; j<n; j++) {
                sum += a[j][i];
            }
            if (sum > maxsum) {
                maxsum = sum;
                element = j;

            }
        }
        System.out.println("The maximum sum is " + maxsum + " and the column number is " + element);
        sc.close();
    }
}
