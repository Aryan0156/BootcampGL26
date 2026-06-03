import java.util.*;

public class Leaders {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of leaders you want to enter: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the leaders you want to enter: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Vector<Integer> v  = new Vector<>();
        int max = arr[n-1];
        v.add(max);
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                v.add(arr[i]);
            }
        }
        for(int i = v.size()-1; i >=0; i--){
            System.out.print(v.get(i) + " ");
        }
        sc.close();
    }
}
