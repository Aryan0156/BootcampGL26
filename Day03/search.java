import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("_________________________");
        int x = sc.nextInt();
        boolean flag = false;
        int min =0;
        for(int i = 0; i<n; i++){
            if(x == arr[i]){
                min = i+1;
                flag = true;
            }
        }
        if(flag){
            System.out.println(x+" found at postion at "+min);
        }
        if(!flag){
            System.out.println(x+" not found");
        }
        sc.close();
    }
    
}
