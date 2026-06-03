import java.util.Scanner;
import java.util.Vector;

public class Spiral {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        Vector<Integer> v = new Vector<>();

        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                v.add(a[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                v.add(a[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    v.add(a[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    v.add(a[i][left]);
                }
                left++;
            }
        }

        System.out.print(v+" ");
        sc.close();
    }
}