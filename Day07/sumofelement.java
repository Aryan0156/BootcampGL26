import java.util.Scanner;

public class sumofelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<n; i++){
            int sum = 0;
            int temp = arr[i];
            while(temp!=0){
                sum = + temp%10;
                temp /= 10;
            }
            if(sum == d ){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("found");
        }
        if(!flag){
            System.out.println("Not found");
        }
        sc.close();
    }
    
    
}
