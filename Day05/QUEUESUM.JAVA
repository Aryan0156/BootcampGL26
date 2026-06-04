import java.util.*;
public class Queuesum {
    public static void main(String[] args) {
       Queue <Integer> q = new LinkedList<>();
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
           q.offer(sc.nextInt());
       }
         int sum = 0;
         while(!q.isEmpty()){
             sum += q.poll();
         }
         System.out.println("Sum of the queue elements: " + sum);
    }
}