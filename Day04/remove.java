import java.util.*;
public class remove {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the kth position ");
        int k = sc.nextInt();
        if(k >= 1 && k < list.size()){
            list.remove(k-1);
        }
         for(int x : list){
            System.out.println(x+" ");
         }
         sc.close();
    
    }
    
}
