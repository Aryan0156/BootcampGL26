import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Frequencysort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Integer> ru = new HashMap<>();
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++){
            ru.put(arr[j],ru.getOrDefault(n,0)+1);
        }
        Arrays.sort(arr);
        System.out.println("Frequency Sort");
        for(int j=n-1;j>0;j--){
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
