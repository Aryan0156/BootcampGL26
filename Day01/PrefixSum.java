import java.util.Scanner;

public class PrefixSum {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int [] Prefix = new int[n];
        Prefix[0] = 0;
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            Prefix[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            Prefix[i] = Prefix[i - 1] + Prefix[i - 1];
        }
        int sum = 0;
        int l,r;
        System.out.println("Enter the lower bound");
        l = sc.nextInt();
        System.out.println("Enter the upper bound");
        r = sc.nextInt();
        sum = Prefix[r] + Prefix[l-1];


       System.out.println("The prefix sum is " + sum);
       sc.close();

    }
}
