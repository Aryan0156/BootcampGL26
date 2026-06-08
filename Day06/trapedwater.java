import java.util.*;
public class trapedwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] h = new int[n];
        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }
        int [] left = new int[n];
        int [] right = new int[n];
        left[0] = h[0];
        right[n-1] = h[n-1];
        for(int i=1; i<n; i++){
            left[i] = Math.max(h[i], left[i-1]);
        }
        for(int i = n-2; i>=0; i--){
            right[i] =  Math.max(h[i],right[i+1]);
        }
        int traped = 0;

        for(int i =0; i<n; i++){
            int wl = Math.min(left[i], right[i]);
            traped += wl-h[i];
        }
        System.out.println("traped water " +traped);
        sc.close();
    }
    
}
