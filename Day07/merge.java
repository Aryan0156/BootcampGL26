import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i =0;
        int j =n-1;
        int m=0;
        while(i<j){
            if(arr[i] == arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                arr[i+1] = arr[i] + arr[i+1];
                i++;
                m++;
            }
            else{
                arr[j-1] = arr[j-1] + arr[j];
                j--;
                m++;
            }
        }
        System.out.print(m);
        sc.close();
    }
    
}
