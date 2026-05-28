import java.util.Arrays;
import java.util.Scanner;

public class Longest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n;
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int max =0;
        int num = arr[0];
        for (int i = 0; i < n; i++) {

            for(int j = i+1; j < n; j++) {
                if(num == arr[j]) {
                    count++;
                }
            }
            if(count > max) {
                max = count ;
                num = arr[i];
            }
        }
        System.out.println(num + " is repeated by " + max);

    }
}
