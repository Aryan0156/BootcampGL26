import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int fd = 0;
        int sd = 0;

        for(int i = 0; i < n; i++) {
            fd += arr[i][i];
            sd += arr[i][n - 1 - i];
        }

        int diff = Math.abs(fd - sd);

        System.out.println("Diagonal Difference = " + diff);
    }
}