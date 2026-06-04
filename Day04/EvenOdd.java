import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
       LinkedList <Integer> list = new LinkedList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the numbers:");
       int n = sc.nextInt();
       for(int i=0; i<n; i++){
        list.add(sc.nextInt());
       }       
       Collections.sort(list);
       Collections.reverse(list);
       for(int x : list){
        if(x%2==0){
            System.out.print(x+" ");    
        }
       }
         for(int x : list){
          if(x%2!=0){
                System.out.print(x+" ");    
          }
         }
         sc.close();
    }
    
}
