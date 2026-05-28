import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element ");
        int n = sc.nextInt();
        int r = n/4;
        int [] arr = new int[n];
        int max=0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int num = arr[0];
        for(int i=0;i<n;i++) {
            int count = 1;
            for(int j=1;j<n;j++){
                if(num == arr[j]){
                    count++;
                }
            }
            if(count > max){
                max = count;
                num = arr[i];
            }
        }
        if(max > r) {
            System.out.println("Highest frequency "+num);
        }
        else{
            System.out.println("There is no such element in the array");
        }

    }
}
