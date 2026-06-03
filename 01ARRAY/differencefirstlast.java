import java.util.*;

public class differencefirstlast {
    static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element you want to enter: ");
        n = sc.nextInt();
        System.out.println("enter the element in the array" );

        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int diff =0;
        diff = Math.abs(arr[0]-arr[n-1]);
        System.out.println("The difference between the two elements is "+ diff);
        sc.close();
        

    }
}
