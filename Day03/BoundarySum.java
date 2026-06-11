import java.util.*;

public class BoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(i == 0 || i == r-1 || j == 0 || j == c-1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Boundary Sum = " + sum);
        sc.close();
    }
}