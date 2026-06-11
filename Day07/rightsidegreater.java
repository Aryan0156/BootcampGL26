import java.util.Scanner;

public class rightsidegreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_______________________________");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] ans = new int[n];
        System.out.println("_____________________________");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int count =0;
        for(int j = i+1; j<n; j++){
            if(arr[j]<arr[i]){
                count++;
            }
            ans[i] = count;
        }
    }
    System.out.println("Answer is ");
    for(int x: ans){
    System.out.print(x+" ");
    }
    sc.close();
}
}
